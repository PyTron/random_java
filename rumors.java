import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class rumors{
    public static void main(String[] args)throws Exception{
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("How many guests will be at the party? (including Bob)");
        int guests = input.nextInt();
        System.out.print("How many iterations would you like to run? (max of 1000000000)");
        double iterations = input.nextDouble();
        while(iterations>1000000000){
            iterations = input.nextDouble();
        }
        double estimate=0.0;
        double probability, everyoneHeard=0.0;
        for(int k=0; k<iterations;k++){
        
            int propagtor=0, informer;
            int[] informed = new int[]{0};
            Boolean spread = true;
        while(spread){
            informer = propagtor;
            int tellMe = rand.nextInt(guests);
                while (tellMe==propagtor || tellMe==informer)
                    tellMe = rand.nextInt(guests);
            propagtor = tellMe;    
            for(int i=0; i<informed.length;i++){
                if(informed[i]==propagtor)
                spread = false;
            }
            if(spread){
            informed = Arrays.copyOf(informed, informed.length + 1);
            informed[informed.length - 1] = propagtor;
            }
        }
       estimate = estimate + informed.length;
       if(informed.length==guests-1)
         everyoneHeard++;
    } 
    System.out.println(everyoneHeard);
    estimate = estimate / iterations;
    probability = everyoneHeard / iterations;
    System.out.println("With a total of " + guests + " guests, an estimated " + estimate + " will hear the rumour.");
    System.out.println("The probability that everyone at the party will hear the rumour is " + probability);
    input.close();
}
}