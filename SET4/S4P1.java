
class Result {
    int marks;

    Result(int m) {
        marks = m;
    }

    public void display() {
        System.out.println("marks:" + marks);

    }

    protected void update(int m) {
        marks = m;

    }

}

class Admin {
    
    public void setStudentMarks(Result r, int m){
        r.update(m);
    }

}

public class S4P1 {
    public static void main(String[] args) {
        Result r= new Result(90);
        Admin a =new Admin();
        a.setStudentMarks(r, 90);

       
        
    }

}
