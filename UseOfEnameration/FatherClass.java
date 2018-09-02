package UseOfNestedClass;

public class FatherClass {                          //PARENT CLASS
    SonClass s1=new SonClass();

    public void fatherdo() {
        s1.soneat();

        System.out.println("This is father method .");
    }
    public void motherdo()
    {
        DaughterClass.daughterwalk();
        System.out.println("This is mother method .");
    }
    public class SonClass{                           //NESTED CLASS
        public void soneat()
        {
            System.out.println("This is son eat method .");
        }
        private void sonwalk()
        {
            System.out.println("This is son walk method .");
        }
    }
    public static class DaughterClass               //NESTED CLASS
    {
     public static void daughtereat()
     {
         System.out.println("This is daughter eat method .");
     }
     private static void daughterwalk()
     {
         System.out.println("this is daughter walk method");
     }
    }

}
