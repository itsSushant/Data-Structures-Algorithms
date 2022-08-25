package Tcs_Gfg;
import java.util.Scanner;
import java.util.*;

public class water
{
   public static int isParenthesisMatch(String str)
   {
       Stack<Character> stack = new Stack<Character>();
       int count = 0;
       char c;
       for(int i=0; i < str.length(); i++)
       {
           c = str.charAt(i);
           if(c == ‘(‘)
               stack.push(c);

           if(c == ‘)’)
           {
               if(stack.empty())
               {
                   count = -1;
                   return count;
               }
               else if(stack.peek() == ‘(‘)
               {
                   count++;
                   stack.pop();
               }
               else
                   return count;
           }     
           }
       return count;
   }

   public static void main(String args[])  
   {
	   
	   Scanner sc = new Scanner(System.in);
	   System.out.println(“Enter the string: “);
	   String str = sc.nextLine();
	   System.out.println(isParenthesisMatch(str));
   }
}

