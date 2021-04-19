import java.util.Random;
public class Classwork1 {
	public static void main(String []args) {
		
		int comd,userd,users=0,coms=0,tie=0;
		//initialize random
		Random ran1= new Random();
		for(int i=0;i<10;i++) {
			//generates 2 random numbers
			comd=ran1.nextInt(6);
			userd=ran1.nextInt(6);
			
			if(userd<comd) 
				coms++;
			else if(userd>comd)
				users++;
			else
				tie++;
        System.out.println("In ROUND # " + (i + 1));
		System.out.println("The user rolled "+(users)+" The computer rolled "+(coms));
		}
		
		if(coms==users){
		System.out.println("It was a tie, the user won " + (users) + " times, and the computer won " + (coms) + " times.");
        while (coms==users){
        comd=ran1.nextInt(6);
        userd=ran1.nextInt(6);
            if(userd<comd) 
                 coms++;
             else if(userd>comd)
                 users++;
            else{
                tie++;
				users++;
				coms++;
				System.out.println("It was another tie, trying again...");
			}
		}
    }
		if(users<coms)
			System.out.println("The computer won with " + (coms) + " to " + (users));
		else{
			System.out.println("The user won with " + (users) +" to " + (coms));
        }
		
	}
}
