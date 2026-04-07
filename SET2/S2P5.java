
class Student {
    int[] marks;
    String name;

    Student() {
        marks = new int[] { 0, 0, 0, 0, 0 };
        name = "Unknown";
    }

    Student(int[] m, String s) {

        marks = m;
        name = s;
    }

    void display() {
        System.out.print("\nName:" + name);
        System.out.print("  Marks:");
        for (int i = 0; i < 5; i++) {
            System.out.print(marks[i] + " ");
        }

    }

}

public class S2P5 {
    public static void main() {
        Student s1 = new Student();
        int[] m = { 23, 45, 67, 34, 56 };
        Student s2 = new Student(m, "Rose");
        s1.display();
        s2.display();

    }

}
