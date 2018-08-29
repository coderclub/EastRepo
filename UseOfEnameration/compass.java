package UseOfEnameration;

public class compass {
    Side s1;
    compass()
    {}
    compass(Side s1){
        this.s1=s1;
    }
    void showdirection(Side s1){

        switch (s1){
            case EAST:
                System.out.println("this is :"+s1);
                break;
            case WEST:
                System.out.println("this is :"+s1);
                break;
            case NORTH:
                System.out.println("this is :"+s1);
                break;
            case SOUTH:
                System.out.println("this is :"+s1);
                break;
            case NOSIDE:
                System.out.println("this is nowhere");
                break;
        }

    }
}
