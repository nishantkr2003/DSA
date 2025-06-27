public class upper {
    public static void main(String[] args) {
        String s = "java PROGRAMMING language";
        String[] words = s.split(" ");
        String result = "";

        for (String word : words) {
            if (!word.isEmpty()) {
                String first = word.substring(0, 1).toUpperCase();
                String rest = word.substring(1).toLowerCase();
                result += first + rest + " ";
            }
        }

        System.out.println(result.trim());
    }
}
