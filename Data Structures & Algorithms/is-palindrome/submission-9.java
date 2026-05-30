class Solution {
    public boolean isPalindrome(String s) {
        char[] stringArray= new char[s.length()];
        String lower=s.toLowerCase();

        int counter=0;
        for (int k=0; k<lower.length(); k++){

            if (Character.isLetterOrDigit(lower.charAt(k))){
                stringArray[counter]=lower.charAt(k);
                counter++;
                
            }


        }
        //now have two pointers
        for (int i=0, j=counter-1; i<j; i++,j--){
            if (stringArray[i]!=stringArray[j])
            {return false;}
        }
        return true;
        
    }
}
