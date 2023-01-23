import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class menu {
    public static void main(String args[])
    {   
          System.out.println("enter the value in the form of 1 or 0");
          Scanner sc=new Scanner(System.in);
          int m=sc.nextInt();
          int i=m;
          for(  ;i==1;i++){
            System.out.println("enter your subject marks");
            int p=sc.nextInt();
            if(p>=90)
            {
                System.out.println("this is good");
            }
            else if(p>=89 && p<=60)
            {
                System.out.println("this is good as well");
            }
            else if(p>=59 && p<=0)
            {
                System.out.println("this is good as well but marks don't matter but our effort does");

            }
            else{
                System.out.println("enter valid marks.");
            }
            
           }
            if(m==0)
            {
                System.out.println("QUIT");
            }
          
    }

    
}
