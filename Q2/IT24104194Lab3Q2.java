import java.util.Scanner;
public class IT24104194Lab3Q2{
 	public static void main (String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the monthly Salary :");
		double value1=input.nextDouble();;
		System.out.print("Enter the OT hours :");
		double value2=input.nextDouble();
		System.out.print("Enter the OT hourly rate :");
		double value3=input.nextDouble();
		
		double TotalSalary=value1+(value2*value3);

	System.out.print("The total salary including OT is : "+TotalSalary);

	}
}