public class linearSearch{
    public static int linearsearch(int numbers[],int key){
        for(int i=0;i<=numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={12,15,14,19,13,17,10,13,25,27};
        int key=10;

        int index=linearsearch(numbers,key);
        if(index==-1){
            System.out.println("No key is found");
        }
        else{
            System.out.println(key+" at index "+index);
        }
    }
}