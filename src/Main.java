import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Enter your first score here: ");

        Scanner myVar=new Scanner(System.in);
        int number=myVar.nextInt();
        double guess=((int)Math.random()*((10-1)+1))+1;

    if(number==guess){
        System.out.println("You got it right!");
    } else {
        System.out.println("Enter another number again:");
        int number2=myVar.nextInt();
        if (number2==guess){
            System.out.println("You got it right!");
        } else {
            System.out.println("Try again!");
        }
    }

    }
}