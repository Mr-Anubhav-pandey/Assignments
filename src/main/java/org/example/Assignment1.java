package org.example;

// Paul Bueltel Oct 22 2022
// this is solution to Q1 on 1st Assignment
public class Assignment1
{

    public static void main(String[] args)
    {
        int dis =9;
        int start =0;
        int end =dis-1;
        int half =end/2;
        int quar =half/2;
        // 1.Write a program(WAP) to print INEURON using pattern programming logic.
        for(int col=start;col<dis;col++)
        {
            // P
            if((row==start && col<end) || col==start || (row==half &&col<end) ||
                    (col==end && row>start && row<half) )
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
        }
    }

}
