import java.util.Scanner;

public class IT24104194Lab3Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a five-value number: ");
        int number = input.nextInt();
        
        if (number < 10000 || number > 99999) {
            System.out.println("Please enter a valid five-digit number.");
        } else {
        
            int value1 = number / 10000;
            int value2 = (number / 1000) % 10;
            int value3 = (number / 100) % 10;
            int value4 = (number / 10) % 10;
            int value5 = number % 10;
            
           
            System.out.println(value1 + " " + value2 + " " + value3 + " " + value4 + " " + value5);
        }
        
        
    }
}
