/* 

public class ArrayDemo {
    public static void main(String[] args) {
        //int[] arr=new int[3];
        // arr[0]=10;
        // arr[1]=20;
        // arr[2]=30;

        int[] arr=new int[]{10,20,30};

        //int[] arr={10,20,30};

        // for(int i=0;i<arr.length;i++)
        // {
        //     System.out.println(arr[i]);
        // }

        for(int i:arr)
        {
            System.out.println(i);
        }
        
    }
}


*/


/* 
public class ArrayDemo{

    // public static void Update(int[] marks)
    // {
    //     for(int i=0;i<marks.length;i++)
    //     {
    //         marks[i]=marks[i]+1;
    //     }
    // }
    public static void main(String[] args) {
        int[] marks={97,98,99};
        Update(marks);
        for(int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }
    
    }
    public static void Update(int[] marks)
    {
        for(int i=0;i<marks.length;i++)
        {
            marks[i]=marks[i]+1;
        }
    }
}

*/

//Sum of all element of given array

public class ArrayDemo{

    public static void main(String[] args) {
        int[] arr={1,2,5,8,4};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("Sum is:"+sum);
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            
        }
        System.out.println("Maximum element:"+max);
    }
}