package dsasheets_qsns;

import java.util.Stack;

public class n13_outer_bracks {
	
	public static String removeOuterParentheses(String s) {
        
        int  i, j;
        Stack stack = new Stack();
        String res = "" ;
    
        // /int n =  ;
        for(i=0; i<s.length();i++)  {
            
            if(s.charAt(i)==('(')) {
                
                stack.push("(");
                
                    if(stack.size() > 1) {
                        
                        res += ("(");
                        
                    
                    }
            }
            else if(s.charAt(i)==(')')) {
                
                if(stack.peek() == "(" && stack.size() > 1){
                    
                    res += ( ")") ;
                    
                }
                    stack.pop();
            }
        }
        return res;
               
    }

	public static void main(String[] args)
	{
		String s = "(()())(())()";
		System.out.print(removeOuterParentheses(s));
	}
}







