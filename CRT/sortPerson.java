import java.util.*;

public class sortPerson {
    public static void main(String[] args) {
        Person[] people = {
            new Person("John", 25),
            new Person("Alice", 30),
            new Person("Bob", 20)
        };
        Arrays.sort(people,(a,b) -> a.age - b.age);
        System.out.println(Arrays.toString(people));
    }
}


class Person{
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
        
    }
}
