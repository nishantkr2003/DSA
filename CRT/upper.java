public class Upper {
    public static void main(String[] args) {
        String s = "java PROGRAMMING language";
        String[] words = s.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            // Check if the word is not empty
            if (word.length() > 0) {
            
                String capitalWord = Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
                result = result + capitalWord + " ";
            }
        }
        result = result.trim();
        System.out.println(result);
    }
}
