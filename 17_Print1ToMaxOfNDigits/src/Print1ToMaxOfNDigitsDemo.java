public class Print1ToMaxOfNDigitsDemo {
    public boolean printNumber(StringBuilder stringBuilder) {
        boolean isOverFlow = false;
        int carryFlag = 0;
        for (int i = stringBuilder.length() - 1; i >= 0; i--) {
            int sum = stringBuilder.charAt(i) - '0' + carryFlag;
            if (i == stringBuilder.length() - 1) {
                sum++;
            }
            if (sum >= 10) {
                if (i == 0) {
                    isOverFlow = true;
                } else {
                    carryFlag = 1;
                    stringBuilder.setCharAt(i, '0');
                }
            } else {
                stringBuilder.setCharAt(i, (char) (sum + '0'));
                break;
            }
        }
        return isOverFlow;
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
            System.out.println(stringBuilder.substring(start));
        }
    }

    public void printNumberRecursively(StringBuilder stringBuilder, int index) {
        if (index == stringBuilder.length() - 1) {
            print(stringBuilder);
            return;
        }
        for (int i = 0; i < 10; i++) {
            stringBuilder.setCharAt(index + 1, (char) (i + '0'));
            printNumberRecursively(stringBuilder, index + 1);
        }
    }
}
