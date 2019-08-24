public class ReplaceBlankDemo {
    public void replaceBlank(StringBuilder stringBuilder) {
        int originalLength = stringBuilder.length();
        if (originalLength == 0) {
            System.out.println("Error: input error.");
            return;
        }
        int numOfBlank = 0;
        for (int i = 0; i < originalLength; i++) {
            if (stringBuilder.charAt(i) == ' ') {
                numOfBlank++;
            }
        }
        int newLength = originalLength + 2 * numOfBlank;
        stringBuilder.setLength(newLength);
        int originalIndex = originalLength - 1;
        int newIndex = newLength - 1;
        while (originalIndex >= 0) {
            if (stringBuilder.charAt(originalIndex) == ' ') {
                stringBuilder.setCharAt(newIndex--, '0');
                stringBuilder.setCharAt(newIndex--, '2');
                stringBuilder.setCharAt(newIndex--, '%');

            } else {
                stringBuilder.setCharAt(newIndex--, stringBuilder.charAt(originalIndex));
            }
            originalIndex--;
        }
        System.out.println(stringBuilder);

    }
}
