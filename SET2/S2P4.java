class Book {
    String title;
    int price;

    Book() {
        title = "Unknown";
        price = 0;

    }
    Book(String t, int p) {
        title = t;
        price = p;

    }
    Book(String s) {
        title = s;
        price = 0;

    }
    void display(){
        System.out.println("Title:"+title+" Price:"+price);
    }
}

public class S2P4 {

    public static void main(){
        Book b1=  new Book();
        Book b2=  new Book("roses", 1000);
        Book b3=  new Book("lillies");
        b1.display();
        b2.display();
        b3.display();


    }
}
