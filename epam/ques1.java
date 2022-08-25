package epam;


//Program to convert integer to string //
public class ques1 {
    int[]divide={1000000000,1000000,1000,1};
    
    String []count={"Billion ","Million ","Thousand ",""};
    
    String[]tenarr={"","Ten","Twenty ","Thirty ","Forty ","Fifty ","Sixty ","Seventy ","Eighty ","Ninety "};
        
    String[]onearr={"","One ","Two ","Three ","Four ","Five ","Six ","Seven ","Eight ","Nine ","Ten ","Eleven ","Twelve ","Thirteen ","Fourteen ","Fifteen ","Sixteen ","Seventeen ","Eighteen ","Nineteen "};
    
    
    
    public String numberToWords(int num) {
        if(num==0)return "Zero";
        
        StringBuilder sb=new StringBuilder();
        
        for(int i=0;i<4;i++){
            int curr=num/divide[i];
            if(curr>0){
                sb.append(helper(curr));
                sb.append(count[i]);
            }
            num=num%divide[i];
        }
        return sb.toString().trim();
    }
    String helper(int num){
        StringBuilder sb=new StringBuilder();
        
        if(num>=100){
            sb.append(onearr[num/100]+"Hundred ");
            sb.append(helper(num%100));
        }   
        else{
            if(num<=19){
                sb.append(onearr[num]);
            }
            else{
                sb.append(tenarr[num/10]+onearr[num%10]);
            }
        }
        return sb.toString();
    }
}