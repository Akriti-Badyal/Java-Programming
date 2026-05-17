import java.util.Scanner;

class Animal {

    String name;
    int age;

    void getData(String n, int a) {
        name = n;
        age = a;
    }

    void eat() {
        System.out.println(name + " is eating");
    }

    void sleep() {
        System.out.println(name + " is sleeping");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println(name + " is barking");
    }

    void display() {
        System.out.println("Dog Name = " + name);
        System.out.println("Dog Age = " + age);
    }
}

class InheritanceDemo {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        Dog d = new Dog();

        System.out.print("Enter dog name: ");
        String n = sc.nextLine();

        System.out.print("Enter dog age: ");
        int a = sc.nextInt();

        d.getData(n, a);

        d.display();
        d.eat();
        d.sleep();
        d.bark();
    }
}