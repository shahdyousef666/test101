public class yalla {

    public String str;

    public yalla(String str) {
        this.str = str;
    }

    public boolean isHexadecimalChar(char ch) {


        if ((ch>='A'&& ch<='F' )||(ch>='a'&& ch<='f' ))
            return true;
        return false;

    }

    public boolean isHexadecimal() {

        if(this.str==null || this.str.length()==0)
            return false;


        for(char ch : str.toCharArray()){
            if (!Character.isDigit(ch) && !isHexadecimalChar(ch)) {
                return false;
            }

        }

        return true;

    }


}

