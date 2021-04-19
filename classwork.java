import java.util.Random;
import java.util.Scanner;
public class classwork {
    public static void main(String[] args) throws Exception {
    Scanner door = new Scanner(System.in);
    Random ran = new Random();
    //generating 3 ints for randoms
    int ranDoor;
    int ranHost;
    int ranCar;
    //generating 3 score keeping ints
    int win=0, loss=0, retry=0;
//we are creating a for loop to do the iteration tests
        for (int i = 0; i< 1000; i++){
            //generating 3 randoms
            ranDoor = ran.nextInt(3);
            ranHost = ran.nextInt(3);
            ranCar = ran.nextInt(3);
            //insuring that the host door is never the car door, and not the users door...
            while(ranHost==ranCar || ranHost == ranDoor){
                ranHost = ran.nextInt(3);
            }
            //Strategy One...  We win if we just stick with our original answer, o

            if (ranDoor == ranCar)
            win++;
            //Strategy two
            else{
                int checkMe = ranDoor;
                while(ranDoor==checkMe || ranDoor == ranHost){
                    ranDoor = ran.nextInt(3);
                }
                if(ranDoor==ranCar)
                retry++;
                else
                loss++;
            }   
        }
        System.out.println("Wins with strategy one: " + win);
        System.out.println("Wins with strategy two: " + retry);
    }
}
