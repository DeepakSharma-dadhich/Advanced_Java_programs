interface inter{
    Book show();
}
class Book{
    Book(){
        System.out.println("thats my first book");
    }
}


public class ConstructurRef {
    public static void main(String[] args) {
        inter ref=Book::new;
        ref.show();
        
    }
}
