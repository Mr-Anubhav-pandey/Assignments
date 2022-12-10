package org.example.assignment3;

import java.util.Scanner;

public class Guesser{
     static int random = (int) (Math.random() * (20 - 1 + 1) + 1);
}
class Player{
    int choice;
    String name;
    Player(int choice,String name){
        this.choice = choice;
        this.name = name;
    }
}
class Umpire{
    int guesser;
    Player [] players;
    Umpire(Player [] players){
        this.players = players;
        whoIsWinner();
    }
    void whoIsWinner(){
        for(Player player : players){
            this.guesser = (int) (Math.random() * (20 - 1 + 1) + 1);
            System.out.println("Welcome :"+player.name);
            int chance = 5;
            while (chance-->0) {
                if (player.choice == guesser) {
                    System.out.println(player.name + "is a winner 🎉");
                    break;
                } else if (player.choice < guesser) {
                    System.out.println(player.name + "choice is less ");
                    System.out.println("and chances left -" + chance);
                } else {
                    System.out.println(player.name + "choice is high");
                    System.out.println("and chances left -" + chance);
                }
                System.out.println("Enter your guess");
                Scanner sc = new Scanner(System.in);
                player.choice = sc.nextInt();
                }
        }
    }
}
class GuessingGame{
    public static void main(String[] args) {
        System.out.println(" Yash Enter choice");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        Player player1 = new Player(choice,"yash");
        System.out.println(" ram Enter choice");
        choice = sc.nextInt();
        Player player2 = new Player(choice,"ram");
        System.out.println(" rahul Enter choice");
        choice = sc.nextInt();
        Player player3 = new Player(choice,"rahul");
        Player [] players = {player1,player2,player3};
        Umpire umpire = new Umpire(players);
    }
}