class Solution {
    public boolean isPalindrome(String s) {

        String s_cleaned = "";
        String backward ="";

        for(int i = 0; i<s.length(); i++){
            char a = s.charAt(i);

            if(a >= 'a' && a <= 'z' || a >= 'A' && a <= 'Z' || a >= '0' && a <= '9'){

                s_cleaned += Character.toString(Character.toLowerCase(a));
            }
        }

        for(int j = s_cleaned.length() - 1; j >= 0; j--){
            backward += Character.toString(s_cleaned.charAt(j));
        }

        if(s_cleaned.equals(backward)){
            return true;
        }
        return false;        
    }
}
