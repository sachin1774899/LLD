package CopyConstructor;

public class Main {

    public static void main(String[] args) {
        Student p1 = new Student(1,"sachin", "TTS",2021);

        Student p2 = new Student(p1);
        Student p3 = new Student(p1);
        Student p4 = new Student(p1);
        p2.id = 3;

        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
    }
}
