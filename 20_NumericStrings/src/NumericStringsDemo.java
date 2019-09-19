public class NumericStringsDemo {
    private boolean isNumeric(StringBuilder str) {
        if (str.length() == 0) {
            return false;
        }
        boolean numeric = scanInteger(str,0);
        return false;


    }

    private boolean scanInteger(StringBuilder str, int index) {
        if (str.charAt(index) == '+' || str.charAt(index) == '-') {
            index++;
        }
        return scanUnsignedInteger(str, index);
    }

    private boolean scanUnsignedInteger(StringBuilder str, int index) {
        boolean exitNumber = false;
        while (index < str.length() && str.charAt(index) >= '0' && str.charAt(index) <= '9'){
            exitNumber = true;
        }
        return exitNumber;
    }
    
}
