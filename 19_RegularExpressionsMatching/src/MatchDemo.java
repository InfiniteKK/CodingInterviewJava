public class MatchDemo {
    public boolean match(StringBuilder string, StringBuilder pattern) {
        if (string.length() == 0 || pattern.length() == 0) {
            return false;
        }
        return matchCore(string, pattern, 0, 0);
    }

    public boolean matchCore(StringBuilder string, StringBuilder pattern, int stringIndex, int patternIndex) {
        if (stringIndex == string.length()&& patternIndex == pattern.length()) {
            return true;
        }
        if (stringIndex != string.length() && patternIndex == pattern.length()) {
            return false;
        }
        if (patternIndex < pattern.length()-1 && stringIndex < string.length() && pattern.charAt(patternIndex + 1) == '*') {
            if (string.charAt(stringIndex) == pattern.charAt(patternIndex) || (pattern.charAt(patternIndex) == '.' && stringIndex <= string.length() - 1)) {
                return matchCore(string, pattern, stringIndex + 1, patternIndex) ||
                        matchCore(string, pattern, stringIndex + 1, patternIndex + 2) ||
                        matchCore(string, pattern, stringIndex, patternIndex + 2);
            } else {
                return matchCore(string, pattern, stringIndex, patternIndex + 2);
            }
        }
        if (stringIndex < string.length() && patternIndex < pattern.length()) {
            if (string.charAt(stringIndex) == pattern.charAt(patternIndex) || pattern.charAt(patternIndex) == '.') {
                return matchCore(string, pattern, stringIndex + 1, patternIndex + 1);
            }
        }

        return false;
    }
}
