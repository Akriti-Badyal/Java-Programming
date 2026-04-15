class Book{
    private int copiesAvailable;

    Book(int c){
        copiesAvailable=c;
    }

    void display(){
        System.out.println("Available copies are "+copiesAvailable);
    }


    void issueBook(){
                try{
            if(copiesAvailable==0){
                throw new Exception("BookUnavailableException");
            }
            else{
                copiesAvailable--;
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());

        }


    }
}
public class S4P10 {
    public static void main(String[] args) {
        Book b= new Book(10);
         Book c= new Book(0);
        b.display();
        b.issueBook();
        b.display();

        c.issueBook();
    }
    
}
