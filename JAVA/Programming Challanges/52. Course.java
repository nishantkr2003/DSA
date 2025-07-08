/*
  52. Design a Course class.
 • Instance variables: courseName, enrolledStudents.
 • Static variable: maxCapacity, the maximum number of students for any 
   course.
 • Instance methods: enrollStudent(String studentName), 
   unenrollStudent(String studentName).
 • Static method: setMaxCapacity(int capacity), to set the maximum 
capacity for courses
 */




 class Course{
    static int  maxCapacity = 100; 
    String courseName;
    int enrollments;
    
    String[] enrollStudents;
    
    Course(String courseName){
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrollStudents = new String[maxCapacity];
    }
    
    
    
    static void setMaxCapacity(int maxCapacity){
        Course.maxCapacity = maxCapacity;
    }
    
    void enrollStudent(String studentName){
        enrollStudents[enrollments] = studentName;
        enrollments++;
    }
    
    
    void unenrollStudent(String studentName){
        System.out.println("Student removed");
        enrollments--;
    }
    
    public static void main(String[] args){
        
    }

 }