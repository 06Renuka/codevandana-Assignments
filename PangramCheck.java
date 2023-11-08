public class PangramCheck {
    public static boolean isPangram(String sentence) {
        boolean[] alphabet = new boolean[26];
        int index;
        int length = sentence.length();

        for (int i = 0; i < length; i++) {
            char c = Character.toLowerCase(sentence.charAt(i));
            if ('a' <= c && c <= 'z') {
                index = c - 'a';
                alphabet[index] = true;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (!alphabet[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String testSentence = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = isPangram(testSentence);
        System.out.println("Is it a pangram? " + isPangram);
    }
}

