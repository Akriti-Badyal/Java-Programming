class Person {
    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }

}

class Student extends Person {
    int rollno;
    String course;

    Student(String n, int a, int r, String c) {
        super(n, a);
        rollno = r;
        course = c;
    }

    void display(){
        System.out.println("ROLLNO:"+rollno);
        System.out.println("COURSE:"+course);
        System.out.println("AGE:"+age);
        System.out.println("NAME:"+name);
    }

}

public class S3P1 {
    public static void main() {
        Student S = new Student("Akriti", 20, 14, "CSE");
        S.display();
    }
}
