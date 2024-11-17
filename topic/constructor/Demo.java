package DSA.topic.constructor;

public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.name);
        System.out.println(s1.rollNo);
        System.out.println(s1.marks_dsa);
        System.out.println(s1.marks_webdev);
        System.out.println(s1.percentage);

        Student s2 = new Student("Rohan", 1, 50, 70);
        System.out.println(s2.name);
        System.out.println(s2.rollNo);
        System.out.println(s2.marks_dsa);
        System.out.println(s2.marks_webdev);
        System.out.println(s2.percentage);
    }
}

class Student {
    public String name;
    public int rollNo;
    public int marks_dsa;
    public int marks_webdev;
    public double percentage;

    // Non parameterized constructor
    public Student() {
        this.name = "Rahul";
        this.rollNo = 1;
        this.marks_dsa = 90;
        this.marks_webdev = 80;
        this.percentage = (double) (this.marks_dsa + this.marks_webdev) / 2;
    }

    // Parameterized constructor
    public Student(String name, int rollNo, int marks_dsa, int marks_webdev) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks_dsa = marks_dsa;
        this.marks_webdev = marks_webdev;
        this.percentage = (double) (this.marks_dsa + this.marks_webdev) / 2;
    }

}
