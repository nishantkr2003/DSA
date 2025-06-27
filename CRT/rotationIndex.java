public class rotationIndex {
    public static void main(String[] args) {
        String s1 = "malayalam";
        String s2 = "alayalayamm";

        if (isRotation(s1, s2)) {
            System.out.println("s1 is a rotation of s2.");
        } else {
            System.out.println("s1 is NOT a rotation of s2.");
        }
    }

    static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        String combined = s2 + s2;
        return combined.contains(s1);
    }
}

