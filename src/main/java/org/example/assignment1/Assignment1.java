package org.example.assignment1;

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
        for(int row=start;row<dis;row++)
        {
            for(int col=0;col<dis;col++)
            {
                // I
                if(col==half && row>=half || col==half && row==quar)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            for(int col=0;col<quar;col++)
            {
                System.out.print(" ");
            }
            for(int col=0;col<dis;col++)
            {
                // N
                if(row==col || col==start || col==end)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            for(int col=0;col<quar;col++)
            {
                System.out.print(" ");
            }
            for(int col=0;col<dis;col++) //E
            {
                if(col==0 || row==0 || row==end || (row==half && col< end-quar))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            for(int col=0;col<quar;col++)
            {
                System.out.print(" ");
            }
            for(int col=0;col<dis;col++) //U
            {
                if((col==start && row<end) || (row==end && col>start && col<end) ||
                        (col==end && row<end))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            for(int col=0;col<quar;col++)
            {
                System.out.print(" ");
            }
            for(int col=0;col<dis;col++)
            {
                // R
                if((row==start && col<end) || col==start || (row==half &&col<end) ||
                        (col==end && row>start && row<half) || row==col && row>=half )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            for(int col=0;col<quar;col++)
            {
                System.out.print(" ");
            }
            //0
            for(int col=0;col<dis;col++)
            {
                if(col==start & row>start && row<end || col ==end && row>start && row<end ||
                        row==start && col>start && col<end || row==end && col>start&&col<end)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            for(int col=0;col<quar;col++)
            {
                System.out.print(" ");
            }
            for(int col=0;col<dis;col++)
            {
                // N
                if(row==col || col==start || col==end)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}