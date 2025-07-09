
class StudentToString{
    String name;
    int age;
    String rollNumber;
    String house;
    
    public StudentToString(String name,int age, String rollNumber,String house){
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.house = house;
    }
    
    
    @Override
    public String toString(){
        return "Student Detail:{name:" + name +
                ". age: " + age + 
                ",roll no. :" + rollNumber +
                ", house :" + house +"}";
    }
    
    public static void main(String[] args){
        
        StudentToString  s = new StudentToString("Nishant",22,"25","BGP");
        String result = s.toString();
        System.out.println(result);
    }
}