package String;


public class Compare {

    public static void main(String[] args) {
        String a = "nishant";
        String b = "nishant";

        System.out.println(a == b); // true, because both refer to the same object in the string pool

        String name1 = new String("nishant");
        String name2 = new String("nishant");
        System.out.println(name1 == name2); // false, because they are different objects in the heap


        System.out.println(name1.equals(name2)); // true, because they have the same content
        System.out.println(name1.equals(a)); // true, because they have the same content
    }
}