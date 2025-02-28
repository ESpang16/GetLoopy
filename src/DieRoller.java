import java.util.Random;
public class DieRoller {
    public static void main(String[] args){
        Random rand=new Random();
        int die1,die2,die3,sum;
        int roll = 0;
        System.out.print("Roll" + " " + "Die 1" + "  " + "Die 2" + "  " + "Die 3" + "  " + "Sum" + "\n" + "--------------------------");
        do {
            die1=rand.nextInt(6)+1;
            die2=rand.nextInt(6)+1;
            die3=rand.nextInt(6)+1;
            sum=die1 + die2 + die3;
            System.out.printf("\n" + roll++ + "      " + die1 + "      " + die2 + "      " + die3 + "     " + sum);
        } while (!(die1 == die2 && die2 == die3));
    }
}
