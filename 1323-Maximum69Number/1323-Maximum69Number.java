// Last updated: 8/16/2025, 1:34:15 PM
class Solution {
    public int maximum69Number (int num) {
        
        String s = ""+num,s2="";
        int j=0;

        for(int i=0 ; i<s.length();i++){ 
            char ch =s.charAt(i);
            

            if(ch == '6' && j==0){ 

                ch = '9';
                s2=s2+ch;
                j=1;
            
            }
            else s2=s2+ch;

        }

        return Integer.parseInt(s2);

    }
}