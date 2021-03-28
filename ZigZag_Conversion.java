// string pattern
/*
Ques ----> 6
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R

And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);

 

Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"

Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I


*/
class Solution {
    public String convert(String s, int numRows) {
       // using HashMap
        Map<Integer,StringBuilder> map = new HashMap<>();
        int position=0;
        boolean increment =  true;
        
        for(char c: s.toCharArray()){
            if(position == numRows){
                increment = false;
                
            }
            if(position == 1){
                increment = true;
            }
            if(increment){
                position ++;
            }
            else{
                position --;
            }
            if(!map.containsKey(position)){
                
                map.put(position,new StringBuilder());
            }
            map.get(position).append(c);
}
        
       StringBuilder result = new StringBuilder();
        for(int i:map.keySet()){
            result.append(map.get(i));
        }
        return result.toString();
    }
}
