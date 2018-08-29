package UseOfEnameration;


public class Eat {


   MyRestaurant r;

   public Eat()
   {

   }

   public Eat(MyRestaurant r)
   {

   this.r=r;
   }

   public void eatingplace(MyRestaurant r){

       switch(r)
       {
           case KFC:
               System.out.println("i will have lunch at :"+r);
               break;
           case DUNKIN:
               System.out.println("i will have lunch at :"+r);
               break;
           case BFC:
               System.out.println("i will have lunch at :"+r);
               break;
           default:
               System.out.println("i will have lunch at no where :");

       }
   }


}
