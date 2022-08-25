package Tcs_Gfg;

public class Parenthesis {


    public List<String> AllParenthesis(int n){
    	
        List<String> result = new ArrayList<>();
        findAll("(",1,0,result,n);
        return result;
    }
    public static void findAll(String current,int o, int c,List<String> result,int n){
        if(current.length()==2*n){
            result.add(current);
            return;
        }
        
        if(o<n){
            findAll(current+"(",o+1,c,result,n);
        }
        if(c<o){
            findAll(current+")",o,c+1,result,n);
        }
        return;
    }
    
    
    
    public static void main(String args[]) {
    	
    	findAll(List<String> result);
    	System.out.println( List<String> result);
    }
}
