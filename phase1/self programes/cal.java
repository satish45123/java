package Profile
;
import java.util.*;
public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a,b,choice;
         float result=0;

         Scanner sc=new Scanner(System.in); 
          
         System.out.print("Enter first number: ");
         a=sc.nextInt();
         System.out.print("Enter second number: ");
         b=sc.nextInt();
         System.out.print("\n1: Addition.\n2: Subtraction.");
         System.out.print("\n3: Multiplication.\n4: Divide.");
         System.out.print("\n5: Remainder.\n6: Exit.");
          
         System.out.print("\nEnter your choice: ");
         choice=sc.nextInt();
          
         switch(choice)
         {
             case 1:
                 result=(a+b); break;
             case 2:
                 result=(a-b); break;
             case 3:
                 result=(a*b); break;
             case 4:
                 result=(float)((float)a/(float)b); break;
             case 5:
                 result=(a%b); break;
             default:
                 System.out.println("An Invalid Choice!!!\n");
         }
         if(choice>=1 && choice<=5)
            System.out.println("Result is: " + result);
          
	}

}