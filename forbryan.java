import java.util.Scanner;
public class forbryan {
public static void main(String[] args)throws Exception{
    Scanner myscan = new Scanner(System.in);
    String apple = "";
    Boolean checkApple = false;
    while(checkApple==false){
        System.out.println("What Color is your apple?");
        apple = "" + myscan.next();
        checkApple = apple.equals("red") || apple.equals("green");
        if (checkApple==false)
        System.out.println("That's not an apple...  Try again.");
    }
    System.out.println("You put " + apple + " and that cause the Boolean checkApple to return " + checkApple);
myscan.close();
}

    
}
