public class BracketsSequence {


    public static void main(String[] args) {
        String targetString = "[((())()(())]]";
        System.out.println(checkBracketLine(targetString));
    }

    private static boolean checkBracketLine(String targetString) {
        int roundBracketCounter = 0;
        int squareBracketCounter = 0;

        for (int i = 0; i < targetString.length(); i++) {
            switch (targetString.charAt(i)) {
                case ('(') : roundBracketCounter++; break;
                case (')') : roundBracketCounter--; break;
                case ('[') : squareBracketCounter++; break;
                case (']') : squareBracketCounter--;
            }
            if (roundBracketCounter < 0 || squareBracketCounter < 0) {
                return false;
            }
        }
        return roundBracketCounter == 0 && squareBracketCounter == 0;
    }
}

