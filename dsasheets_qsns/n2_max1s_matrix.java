package dsasheets_qsns;

public class n2_max1s_matrix {
	
	public static int rowWithMax1s(int arr[][], int n, int m) {
	       // code here
	       
	       
	       int g = Integer.MAX_VALUE; // storing mx value here
	       
	       int p=-1;
	       
	       for(int i=0;i<n;i++) //rows
	       {
	           for(int j=0;j<m;j++) // columns
	           {
	               if(arr[i][j]==1) // our main condition
	               {
	                   if(g>j)
	                   {
	                       g=j;
	                       p=i;
	                       
	                       break;
	                   }
	               }
	           }
	       }
	       return p; // return statemnet
	   }
	
	public static void main(String[] args)
    {
        int[][] arr = { { 0, 0, 0, 1 },
                        { 0, 1, 1, 1 },
                        { 1, 1, 1, 1 },
                        { 0, 0, 0, 0 } };
        
        System.out.println("Index is "+ rowWithMax1s(arr));
    }
}
