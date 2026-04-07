

class Student{
    String name;
    int rollno;
    Student(){
        name = "Unknown";
        rollno = 0;
    }
    Student(String n, int r){
        name = n;
        rollno =r;
    }
    void display(){
        System.out.println("Name:"+name);
        System.out.println("Rollno:"+rollno);
    }

}
public class S2P1{
    public static void main(){
        Student s1 = new Student("akriti",14);
        Student s2 = new Student("Riza", 12);
        s1.display();
        s2.display();

    }
}