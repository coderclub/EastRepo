package UseOfStatic;

public class Student {
    String name;
    static int age;
    public void nameinfo()
    {
        System.out.println("student name :"+name);
    }
    public static void ageinfo()
    {
        System.out.println("student age :"+age);
    }
}
