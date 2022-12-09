package org.example;

// Paul Bueltel Oct 22 2022
// this is solutions to Homework Assignment 1 q2-q5
public class Main
{
// q1- Write program to print INEURON is uploaded separately.

    public static void main(String[] args)
    {

        int dis =14; // length of display(distance)
        int start =0; // starting point for rows & columns
        int end =dis-1; // calculates ending point of display length

        // calculates the half & quarter lengths of the display length
        // to use through out program
        double half =end/2; // calculates half of the display length
        double quar =half/2;
        // variables to choose what to display
        char opt ='*';
        char space =' ';

// q2 was done last & added to top of already existing class
        // so it uses its own variables & code
// q2 write a program to print
        //   1111
        //  2222
        //  3333
        // 4444
        int numForQ2 =5;
        for(int row=1;row<numForQ2;row++)
        {
            for(int col=0;col<numForQ2;col++)
            {
                System.out.print(row);
            }
            System.out.println();
        }
////////////end of q2


// 	the following are solutions to q3,4&5 using pattern programming
        for(int row=start;row<dis;row++)
        {
            //  q3 house
            for(int col=start;col<dis;col++)
            {
                if(row==start || col==start || row+col<=half ||
                        (col-row>=half) || col==end && row<=half ||
                        row==end||col==end)
                {
                    System.out.print(opt);
                }
                else
                {
                    System.out.print(space);
                }
            }
// add space between solutions
            for(int col=0;col<quar;col++)
            {
                System.out.print(" ");
            }
            // q4 outside fill bottom half diamond
            for(int col=start;col<dis;col++)
            {
                if(row-col>=half || row+col>=end+half)
                {
                    System.out.print(opt);
                }
                else
                {
                    System.out.print(space);
                }
            }
// add space between solutions
            for(int col=0;col<quar;col++)
            {
                System.out.print(" ");
            }
            // q5 left outside diamond K filled thingy
            for(int col=start;col<dis;col++)
            {
                if(row==start || col==start || row==end || col+row<=half || row-col>=half)
                {
                    System.out.print(opt);
                }
                else
                {
                    System.out.print(space);
                }
            }
            System.out.println();
        }
    }
}