public class InsertAtIndex {

    static void InsertElement(int arr[],int n,int key,int pos){
        for(int i=n-1;i>=pos-1;i--){
            arr[i+1]=arr[i];

        }
        arr[pos]=key;

    }
    public static void main(String[] args) {
        int arr[] = new int[15];
        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 1;
        arr[3] = 8;
        arr[4] = 5;
         int n = 5;
        // int key=10;
        // int pos=2;
        System.out.println("Before insertion");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        InsertElement(arr,5,10,2);
        System.out.println("\nAfter Insertion:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
