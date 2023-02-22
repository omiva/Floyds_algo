package com.company;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int[][] arr =new int[10][10];
        int i, j;
        Scanner ss = new Scanner(System.in);

        System.out.println("ALL-PAIRS SHORTEST PATH USING FLOYD'S ALGORITHM");
        System.out.println("ENTER THE NUMBER OF VERTICES: ");
        int n = ss.nextInt();
        System.out.println("ENTER THE ELEMENTS OF THE MATRIX");

        for (i=1;i<=n;i++)
        {
            for (j = 1; j <= n; j++)
            {
                arr[i][j] = ss.nextInt();
            }
        }
        System.out.println("THE MATRIX: ");
        for(i=1;i<=n;i++)
        {
            for(j=1; j<=n; j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        floyd(arr,n);
        System.out.println("ALL-PAIRS SHORTEST PATH MATRIX:");
        for (i=1; i<=n; i++)
        {
            for (j=1; j<=n; j++)
                System.out.print(arr[i][j]+"\t");
            System.out.println();
        }

    }
    static void floyd(int[][] arr, int n)
    {
        for (int k=1; k<=n; k++)
        {
            for (int i = 1; i <= n; i++)
            {
                for (int j = 1; j <= n; j++)
                {
                    arr[i][j] = min(arr[i][j], arr[i][k] + arr[k][j]);
                }
            }
        }
    }
    static int min(int a,int b)
    {
        if(a>b)
            return b;
        else return a;
    }
}

