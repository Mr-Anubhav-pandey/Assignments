package org.example;

public class Assignment_a {
//    2. Write a program to print
//        1 1 1 1
//        2 2 2 2
//        3 3 3 3
//        4 4 4 4
public static void main(String[] args) {
    for(int i =1;i<5;i++){
        for (int j=1;j<5;j++){
            System.out.print(i);
        }
        System.out.println();
    }
    //
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