import java.util.*;
import java.lang.*;
import java.io.*;

class positive
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 int a;   
         Scanner s= new Scanner(System.in);
         a=s.nextInt();
         
        if (a < 0)
        {
            System.out.println("Negative");
        }
        else if ( a== 0)
         {   System.out.println("Zero");

         }
        else
          {  System.out.println("Positive");
           
          } 
	}
	
}
