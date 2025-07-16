import java.util.PriorityQueue;
import java.util.Scanner;


class Patient{
    int id;
    int priority;

    Patient(int id, int priority){
        this.id = id;
        this.priority = priority;
    }

}



public class patientQueue{
    public static void main(String[] args) {
        PriorityQueue<Patient> queue = new PriorityQueue<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of patients: ");
        int n = sc.nextInt();
        

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of patient " + (i + 1) + ": ");
            int id= sc.nextInt();
            System.out.print("Enter priority of " + name + ": ");
            int priority = sc.nextInt();
            sc.nextLine(); 
            queue.offer(new Patient(name, priority));
        }

        
        System.out.println("\nPatients priority order:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll()); 
        }

    } 
}