package UseOfStatic;

public class TestStudent {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="ahmed";
        Student.age=30;
        s1.nameinfo();
        Student.ageinfo();
    }

}
