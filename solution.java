import java.util.Scanner;
public class solution {
    public static void main(String[] args) throws Exception{
        Scanner meas = new Scanner(System.in);
            System.out.println("Reboot the computer and try to connect..");
            System.out.println("Did that fix the problem?? (enter true or false)");
            Boolean answer = meas.nextBoolean();
                if (answer == true){

                }
                else {
                    System.out.println("Reboot the router and try to connect...");
                    System.out.println("Did that fix the prbolem??");
                    answer = meas.nextBoolean();
                    if (answer == true){

                    }
                    else {
                        System.out.println("Make sure the cables between the modem and router are plugged in firmly...");
                        System.out.println("Did that fix the prbolem??");
                        answer = meas.nextBoolean();
                        if (answer == true){

                        }
                        else {
                            System.out.println("Move the router to a new location and try to connect...");
                            System.out.println("Did that fix the prbolem??");
                            answer = meas.nextBoolean();
                            if (answer == true){

                            }
                            else {
                                System.out.println("get a new router");
                            }
                        }
                    }
                }
            
        meas.close();
    }
}