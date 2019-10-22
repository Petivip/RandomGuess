import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your first score here: ");

        Scanner myVar = new Scanner(System.in);
        int number = myVar.nextInt();
        double guess = (int)((Math.random() * ((10 - 1) + 1)) + 1);
  while(true){
      if(number==guess){
          System.out.println("You got it right!");
          break;
      } else {
          System.out.println("Enter another number again:");
          number = myVar.nextInt();
      }

  }
    }
}