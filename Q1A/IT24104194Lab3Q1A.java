import java.util.Scanner;
public class IT24104194Lab3Q1A{
 	public static void main (String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the price of 1kg rice :");
		double value1=input.nextDouble();
		System.out.print("Enter the number of kilograms you want to buy :");
		double value2=input.nextDouble();


	
	double TotalAmount=value1*value2;
	System.out.print("The Total amount is :"+TotalAmount);
	
}
}