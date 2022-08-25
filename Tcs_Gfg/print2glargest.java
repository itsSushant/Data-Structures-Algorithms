package Tcs_Gfg;

import java.util.*;

class Solution {
   int print2largest(int arr[], int n) {
       //sorting array
      Arrays.sort(arr);
       
       int max2=arr[0];
       int count=0;
       
       for(int i=n-1; i>=1 ;i-- ){
           if(arr[i]==arr[i-1]){
               count++;
               continue;
           }
           
           if(arr[i]!=arr[i-1]){
               max2= arr[i-1];
               break;
           }
       }
       //if all elements of the array are same return -1
       if (count==n-1){
           return -1;
       }else{
           
       return max2;
       }
   }
   
   
   
//   public static void main(String[] args) {
//	   Scanner sc = new Scanner(System.in);
//	   
//	   char[] max2 = null;
//	System.out.println(max2);
//}
//	
	
}
