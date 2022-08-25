package TCS22_Slots;

import java.util.*;
import java.util.Scanner;
public class Main

{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        int i;

        for (i = 0; i < n; i++)

        {

            arr[i] = sc.nextInt();

        }

        int count = 0;

        for (i = 0; i < n; i++)

        {
                if (arr[i] == arr[0])
{
                    count++;
                }
        }
        System.out.println(n-count);
    }
}