import java.util.Scanner;
public class credit {
        public static void main(String[] args) throws Exception {
            System.out.println("Enter an 16 digit credit card");
            Scanner card = new Scanner(System.in);
            String credit = card.next();
            int creditC[] = new int[16];
            while(credit.length() != 16){
                System.out.println("invalid...  Enter a new card..");
                credit = card.next();
            }
            for (int i = 0; i < 16; i++){
                if (Character.isDigit(credit.charAt(i)))
                    creditC[i] = Character.getNumericValue(credit.charAt(i));
                else{
                    System.out.println("invalid...  Enter a new card..");
                    i = 0;
                    credit = card.next();
                    }
                }

            

    }
}
    