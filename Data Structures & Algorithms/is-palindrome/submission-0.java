class Solution {
    public boolean isPalindrome(String s) {
        //check chars from the start and from the end of the string 

        int end = s.length() - 1, st  = 0;

        while(st <= end){
            char ls = s.charAt(st);
            char le = s.charAt(end);

            if(!isLetter(ls)){
                st++;
                continue;
            }

            if(!isLetter(le)){
                end--;
                continue;
            }

            //character comparison check
            if(isNumber(ls) && isNumber(le)){
                if(ls != le)
                    return false;
            }else if(isChar(ls) && isChar(le)){
                if(Character.toLowerCase(ls) != Character.toLowerCase(le))
                    return false;
            }else{
                return false;
            }

            st++;
            end--;
        }

        return true;
    }

    private boolean isChar(char ch){
        if(ch >= 'a' && ch <= 'z'){
            return true;
        }

        if(ch >= 'A' && ch <= 'Z'){
            return true;
        }

        return false;
    }

    private boolean isNumber(char ch){
        return (ch >= '0' && ch <= '9') ? true : false;
    }

    private boolean isLetter(char ch){
        if(ch >= 'a' && ch <= 'z'){
            return true;
        }

        if(ch >= 'A' && ch <= 'Z'){
            return true;
        }

        if(ch >= '0' && ch <= '9'){
            return true;
        }

        return false;
    }
}
