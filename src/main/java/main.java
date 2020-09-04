import java.util.Scanner;
public class main {


    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        calcFunctions display = new calcFunctions();
        display.update(0);

        System.out.print("Please enter a number to use as a base: ");
        double number = userInput.nextDouble();
        display.update(number);
        System.out.println(display.add(6));
        System.out.println(display.subtract(1));
        System.out.println(display.sqrt());
        System.out.println(display.inv());
        System.out.println(display.divide(0));










    }
}

























