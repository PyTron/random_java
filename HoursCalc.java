import java.util.Scanner;
public class HoursCalc
{
public static void main(String[] args) throws Exception
{

    Scanner conv = new Scanner(System.in);
    Scanner zone = new Scanner(System.in);
    System.out.println("What Time Did you Clock in HH:MM?");
    String timeClocked = "";
    while (timeClocked.length() < 5){
        timeClocked = timeClocked + conv.nextLine();
        if (timeClocked.length() == 5){
            if (Character.isDigit(timeClocked.charAt(0)) && Character.isDigit(timeClocked.charAt(1)) && Character.isDigit(timeClocked.charAt(3)) && Character.isDigit(timeClocked.charAt(4))){
                String parseMe = "" + timeClocked.charAt(0) + timeClocked.charAt(1);
                int parseFin = Integer.parseInt(parseMe);
                if (parseFin >= 0 && parseFin <= 12){
                    parseMe = "" + timeClocked.charAt(3) + timeClocked.charAt(4);
                    parseFin = Integer.parseInt(parseMe);
                    if (parseFin >= 0 && parseFin < 60){
                        
                    }
                    else{
                        timeClocked = "";
                        System.out.println("Please Enter A Valid Time...");
                    }
                }
                else{
                    timeClocked = "";
                    System.out.println("Please Enter A Valid Time...");                    
                }
            }
            else{
                timeClocked = "";
                System.out.println("Please Enter A Valid Time...");
            }
        }
        else{
            timeClocked = "";
            System.out.println("Please Enter A Valid Time...");
        }
    }
    System.out.println("am or pm?");
    String tod = zone.nextLine();
    Boolean ampm = true;
    if (tod.equals("am")){
        ampm = false;
    }
    else if (tod.equals("pm")){
        ampm = true;
    }
    else{
        System.out.println("invalid");
        System.exit(0);
    }

// This Method will take the hours and minutes and return two integer values, these are the values
//That we will be working with
    String hourStart = ""; 
    hourStart = hourStart + timeClocked.charAt(0) + timeClocked.charAt(1);
    String minuteStart = "";
    minuteStart = minuteStart + timeClocked.charAt(3) + timeClocked.charAt(4);
    int hours = Integer.parseInt(hourStart);
    int minutes = Integer.parseInt(minuteStart);
    System.out.println("How Many Hours Have You Already Worked? Enter as a Decimal 00.00");
    String timeWorked = "";
    while (timeWorked.length() < 5){
        timeWorked = timeWorked + conv.nextLine();
        if (timeWorked.length() == 5){
            if (Character.isDigit(timeWorked.charAt(0)) && Character.isDigit(timeWorked.charAt(1)) && Character.isDigit(timeWorked.charAt(3)) && Character.isDigit(timeWorked.charAt(4))){
               String parseMe = "" + timeWorked.charAt(0) + timeWorked.charAt(1);
                int parseFin = Integer.parseInt(parseMe);
                if (parseFin >= 0 && parseFin <= 99){
                    parseMe = "" + timeWorked.charAt(3) + timeWorked.charAt(4);
                    parseFin = Integer.parseInt(parseMe);
                    if (parseFin >= 0 && parseFin <= 99){

                    }
                    else {
                        timeWorked = "";
                        System.out.println("Please Enter A Valid Time...");
                    }
                }
                else{
                    timeWorked = "";
                    System.out.println("Please Enter A Valid Time...");
                }
            }
            else{
                timeWorked = "";
                System.out.println("Please Enter A Valid Time...");
            }
        }
        else{
            timeWorked = "";
            System.out.println("Please Enter A Valid Time...");
        }
    }
    //We ask for a decimal since most WFM software works in decimal hours...  This is what employees will have.
    //We will convert this decimal into a working number... We need to convert it to a 60 minute number
    //the code is simple, we will use a string because we wont have to write a function to parse, 
    //we will then use a double for our calculation, and back to int for a working number.
    String hoursWorked = "";
    String minutesWorked = "";
    hoursWorked = hoursWorked + timeWorked.charAt(0) + timeWorked.charAt(1);
    minutesWorked = minutesWorked + timeWorked.charAt(3) + timeWorked.charAt(4);
    int hoursW = Integer.parseInt(hoursWorked);
    //this will convert it to 60 minutes dropping the remainder and adding 1, that's what we want because we don't want to
    //generate accidental overtime, this will keep us under actual by less than a minute. at our conclusion
    double minutesWo = ((Double.parseDouble(minutesWorked) * .01) * 60.0);
    //I'm going to calculate the seconds here, this is mainly for shits and gigs.
    int seconds = (int)Math.round(minutesWo * 100);
    seconds = seconds % 100;
    Double secondsDoub = (seconds * .01) * 60;
    seconds = (int)Math.round(secondsDoub);
    int minutesW = (int)Math.round(minutesWo);
    //I need the decimal speparated, so I will input as string and convert.  This is easier for me  Obviously
    //this code breaks at <100 hours, but this could be fixed.  Right now it's unlikely enough for an employee working
    //over 100 hours to be worried about the time they need to get off the clock that I'm not worried about it.
    System.out.println("How Many Hours are You Allowed to Work? Enter as a HH:MM");
    String timeAvail = "";
    while (timeAvail.length() < 5){
        timeAvail = timeAvail + conv.nextLine();
        if (timeAvail.length() == 5){
            if (Character.isDigit(timeAvail.charAt(0)) && Character.isDigit(timeAvail.charAt(1)) && Character.isDigit(timeAvail.charAt(3)) && Character.isDigit(timeAvail.charAt(4))){
                String parseMe = "" + timeAvail.charAt(0) + timeAvail.charAt(1);
                int parseFin = Integer.parseInt(parseMe);
                if (parseFin >= 0 && parseFin <= 99){
                    parseMe = "" + timeAvail.charAt(3) + timeAvail.charAt(4);
                    parseFin = Integer.parseInt(parseMe);
                    if (parseFin >= 0 && parseFin < 60){
                        
                    }
                    else{
                        timeAvail = "";
                        System.out.println("Please Enter A Valid Time...");
                    }
                }
                else{
                    timeAvail = "";
                    System.out.println("Please Enter A Valid Time...");                    
                }
            }
            else{
                timeAvail = "";
                System.out.println("Please Enter A Valid Time...");
            }
        }
        else{
            timeAvail = "";
            System.out.println("Please Enter A Valid Time...");
        }
    }
    //Same as before, we will make two working numbers
    String hoursAvail = "";
    String minutesAvail = "";
    hoursAvail = hoursAvail + timeAvail.charAt(0) + timeAvail.charAt(1);
    minutesAvail = minutesAvail + timeAvail.charAt(3) + timeAvail.charAt(4);
    int hoursA = Integer.parseInt(hoursAvail);
    int minutesA = Integer.parseInt(minutesAvail);  //I add one to compensate for dropping remainder.  Prevents accidental overtime.
                                                        //this needs more testing...
 //This concludes the generation of the numbers we need, now we just need to do the math...
 //First we will find out how many hours and minutes we have left to work...
    if(hoursW < hoursA || (hoursW == hoursA && minutesA > minutesW)){
        if (ampm == true && hours != 12){
            hours = hours + 12;
        }
        int hoursLeft = hoursA - hoursW;
        int minutesLeft = minutesA - (60 - minutesW);
            if (minutesLeft < 0) {
                hoursLeft = hoursLeft - 1;
                minutesLeft = minutesLeft * (-1);
            }
            if (minutesLeft >= 60){
                hoursLeft = hoursLeft + 1;
                minutesLeft = minutesLeft - 60;
            }
            if(hoursLeft < 0 || minutesLeft < 0){
                System.out.println("You are over your hours.");
                System.exit(0);
            }
            System.out.println("");
            System.out.println("You are able to work " + hoursLeft + " hours " + minutesLeft + " minutes and " + seconds + " seconds.");
            System.out.println("");
            //I am going to restrict the length of the lunch to 60 minutes to make the coding easier, but realistically
    //if we needed to, we could fix this in the future.
    System.out.println("How Many Minutes For Lunch(Enter 0 for no lunch, or 0 for an End of Shift Lunch)");
    int lunchTime = conv.nextInt();
        minutesLeft = minutesLeft + lunchTime;
        while (minutesLeft >= 60) {
            hoursLeft = hoursLeft + 1;
            minutesLeft = minutesLeft - 60;
        }
        int hoursFinal = hours + hoursLeft;
        int minutesFinal = minutes + minutesLeft;
            if (minutesFinal >= 60){
                hoursFinal = hoursFinal + 1;
                minutesFinal = minutesFinal - 60;
            }
            System.out.println("");
            System.out.println("With a " + lunchTime + " minute lunch, you are able to work " + hoursLeft + " hours " + minutesLeft + " minutes and " + seconds + " seconds.");
            System.out.println("...........................................................");
            System.out.println("");
            if (hoursFinal == 12 && minutesFinal < 10){
                System.out.println("You need to clock out by " + hoursFinal + ":0" + minutesFinal + " P.M.");
            }
            else if (hoursFinal == 12){
                System.out.println("You need to clock out by " + hoursFinal + ":" + minutesFinal + " P.M.");
            }
            else if (hoursFinal > 24){
                System.out.println("You aren't able to work over your hours before end of day.");
            }
            else if (hoursFinal > 12 && minutesFinal < 10){
                hoursFinal = hoursFinal - 12;
                System.out.println("You need to clock out by " + hoursFinal + ":0" + minutesFinal + " P.M.");
            }
            else if (hoursFinal > 12){
                hoursFinal = hoursFinal - 12;
                System.out.println("You need to clock out by " + hoursFinal + ":" + minutesFinal + " P.M.");
            }
            else if (hoursFinal < 12 && minutesFinal < 10){
                hoursFinal = hoursFinal - 12;
                System.out.println("You need to clock out by " + hoursFinal + ":" + minutesFinal + " P.M.");
            }
            else {
                System.out.println("You need to clock out by " + hoursFinal + ":" + minutesFinal + " A.M.");
            }
        }
    else{
        System.out.println("You are already over your hours.");
    }

conv.close();
zone.close();
}
}