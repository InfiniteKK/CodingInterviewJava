import sun.font.TrueTypeFont;

public class PrintMinOfNDigitsTo0Demo {
    public boolean printNumber(StringBuilder stringBuilder) {
        boolean exitFlag = false;
        int length = stringBuilder.length();
        if (stringBuilder.charAt(length - 1) == '0') {
            int nonZeroIndex = length - 1;
            for (int i = length - 1; i >= 0; i--) {
                if (stringBuilder.charAt(i) != '0') {
                    stringBuilder.setCharAt(i, (char) (stringBuilder.charAt(i) - 1));
                    nonZeroIndex = i;
                    break;
                }
            }
            if (nonZeroIndex == length - 1) {
                exitFlag = true;
            } else {
                for (int i = nonZeroIndex + 1; i < length; i++) {
                    stringBuilder.setCharAt(i, '9');
                }
            }
        } else {
            stringBuilder.setCharAt(length - 1, (char) (stringBuilder.charAt(length - 1) - 1));
        }
        return exitFlag;
    }

    public void print(StringBuilder stringBuilder) {
        int start = stringBuilder.length();
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) != '0') {
                start = i;
                break;
            }
        }
        if (start < stringBuilder.length()) {
            System.out.println("-" + stringBuilder.substring(start));
        }
    }

    public void printNumberRecursively(StringBuilder stringBuilder, int index) {
//        System.out.println(stringBuilder);
        if (index == stringBuilder.length() - 1) {
            print(stringBuilder);
            return;
        }
        for (int i = 9; i >= 0; i--) {
            stringBuilder.setCharAt(index + 1, (char) (i + '0'));
            printNumberRecursively(stringBuilder, index + 1);
        }
    }

}
