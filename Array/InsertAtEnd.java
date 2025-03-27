public class InsertAtEnd {

    static int insertStored(int arr[],int n,int key,int capacity){
        if(n>=capacity)
        {
            return n;
        }
        arr[n]=key;
        return (n+1);
    }
    public static void main(String[] args) {
        int capacity=20;
        int arr[]=new int[20];
        arr[0]=5;
        arr[1]=9;
        arr[2]=6;
        arr[3]=4;
        arr[4]=10;
        arr[5]=15;
        int n=6;
        int key=60;
        System.out.println("Before insertion:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        n=insertStored(arr,n,key,capacity);
        System.out.println("\nAfter inserting");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
