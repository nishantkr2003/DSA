package in.kgcoding.challange80;

public class LibraryItem {
    private String itemId;
    private String name;
    private String auther;
    
    public void checItem(){
        System.out.println("checkout");
    }

    public void returnItem(){
        System.out.println("Returning the item");
    }
}
