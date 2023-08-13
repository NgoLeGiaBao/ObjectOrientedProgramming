public class String_EX2 {
    public static int countWord(String paragraph) {
        String [] s = paragraph.split(" ");
        return s.length;
    }
    public static int  countSentences(String paragraph) {
        String [] s = paragraph.split("\\.");
        return s.length;
    }
    public static int countAppear(String paragraph, String word) {
        int countAppearWord = 0;
        String p1 = paragraph.replaceAll(",","");
        String p2 = p1.replaceAll("\\.","");
        String [] arrayWord = p2.split(" ");
        for (int i = 0; i < arrayWord.length; i++) {
            if (arrayWord[i].equalsIgnoreCase(word)) {
                countAppearWord++;
            }
        }
        return countAppearWord;
    }
    public static void main (String [] args) {
        String s = "The Edge Surf is of course also a whole lot better, which will hopefully win Microsoft some converts. It offers time trial, support for other input methods like touch and gamepads, accessibility improvements, high scores, and remastered visuals.";
        System.out.println("A number of words in paragraph are: " + countWord(s));
        System.out.println("A number of sentences in paraph are: " + countSentences(s));
        System.out.println("A number appear from input are: " + countAppear(s, "better"));
    }
}