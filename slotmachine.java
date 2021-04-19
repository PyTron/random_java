import java.util.Random;
import java.util.Scanner;
public class slotmachine {
    public static void main(String []args) {
    Random rand = new Random();
    String[] strA = new String[] {"Cherries", "Oranges", "Plums", "Bells", "Melons", "Bars"};
    Scanner util = new Scanner(System.in);
    String cont;
    int payout;    
    do {
        System.out.print("How much would you like to gamble?  $");
        int gamble = util.nextInt();
        int ran1 = rand.nextInt(6);
        int ran2 = rand.nextInt(6);
        int ran3 = rand.nextInt(6);
        System.out.println("You Pull The Lever...");
        System.out.println(strA[ran1] + " " + strA[ran2] + " " + strA[ran3]);
        if ((ran1 == ran2)&&(ran2 == ran3))
            payout = 3 * gamble;
        else if ((ran1 == ran2)||(ran2 == ran3)||(ran1 == ran3))
            payout = 2 * gamble;
        else
            payout = 0;
        System.out.println("You gambled $" + gamble + " and you won $" + payout);
        System.out.println("would you like to bet again?  yes or no");
        cont = util.next();
        cont = cont.toLowerCase();
    } 
    while(cont.charAt(0) == 'y');
}
}
