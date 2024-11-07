import java.util.Scanner;

public class IT24104194Lab3Q3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount in rupees: ");
        int amount = input.nextInt();
        

        int value5000 = amount / 5000;
        amount %= 5000;
        int value1000 = amount / 1000;
        amount %= 1000;
        int value500 = amount / 500;
        amount %= 500;
        int value200 = amount / 200;
        amount %= 200;
        int value100 = amount / 100;
        amount %= 100;
        int value50 = amount / 50;
        amount %= 50;
        int value20 = amount / 20;
        amount %= 20;
        int value10 = amount / 10;
        amount %= 10;
        int value5 = amount / 5;
        amount %= 5;
        int value2 = amount / 2;
        amount %= 2;
        int value1 = amount;

        System.out.println("5000/= : " + value5000);
        System.out.println("1000/= : " + value1000);
        System.out.println("500/=  : " + value500);
        System.out.println("200/=  : " + value200);
        System.out.println("100/=  : " + value100);
        System.out.println("50/=   : " + value50);
        System.out.println("20/=   : " + value20);
        System.out.println("10/=   : " + value10);
        System.out.println("5/=    : " + value5);
        System.out.println("2/=    : " + value2);
        System.out.println("1/=    : " + value1);    }
}
