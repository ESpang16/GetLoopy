import java.util.Random;
import java.util.Scanner;
public class DieRoller {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        Random rand=new Random();
        int die1,die2,die3,sum;
        int roll = 0;
        String response;
        do {
            System.out.print("Roll" + " " + "Die 1" + "  " + "Die 2" + "  " + "Die 3" + "  " + "Sum" + "\n" + "--------------------------");
            do {
                die1 = rand.nextInt(6) + 1;
                die2 = rand.nextInt(6) + 1;
                die3 = rand.nextInt(6) + 1;
                sum = die1 + die2 + die3;
                System.out.printf("\n" + roll++ + "      " + die1 + "      " + die2 + "      " + die3 + "     " + sum);
            } while (!(die1 == die2 && die2 == die3));

            System.out.print("\nTriple rolled! Do you want to play again? (Y/N): ");

            while (true) {
                response = in.nextLine();
                if (response.equalsIgnoreCase("Y") || response.equalsIgnoreCase("N")) {
                    break;
                }else {
                    System.out.print("Invalid input. Please enter 'Y' or 'N': ");
                }
            }
        } while (response.equalsIgnoreCase("Y"));
            System.out.println("Thanks for playing!");
    }
}