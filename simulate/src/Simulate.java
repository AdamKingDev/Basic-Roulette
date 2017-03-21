

import java.util.Scanner;
import java.util.Random;
import java.lang.*;


public class Simulate {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int chance = ran.nextInt(100) + 1;


        System.out.println("Bet on a color.");
        String color = sc.nextLine();
        try {
            Thread.sleep(500);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println("How much do you want to bet on "+color+"?");
        int bet = sc.nextInt();


        try {
            Thread.sleep(500);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        if (bet == 1){
            String credits = ("credit");
            System.out.println("You bet "+bet+" "+credits+" on "+color+".");

        }
        else {
            String credits = ("credits");
            System.out.println("You bet "+bet+" "+credits+" on "+color+".");

        }
        try {
            Thread.sleep(3000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }


        if (color.equals("black")){
            if (chance <= 49){
                System.out.println("You win. The magic number was " +chance+ ".");
            }
            else{
                System.out.println("You lose. The magic number was " +chance+ ".");
            }
        }
        if (color.equals("green")){
            if (chance == 50){
                System.out.println("You win. The magic number was " +chance+ ".");
            }
            else{
                System.out.println("You lose. The magic number was " +chance+ ".");
            }

        }
        if (color.equals("red")){
            if (chance >= 51){
                System.out.println("You win. The magic number was " +chance+ ".");
            }
            else{
                System.out.println("You lose. The magic number was " +chance+ ".");

            }
            sc.close();
        }
    }

}
