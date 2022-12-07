import java.util.Scanner;
public class BasicCalculator {
	public static void main(String[] args) {
		
        int num1, num2;// take two numbers
        Scanner sc = new Scanner(System.in);
  
        System.out.println("Enter the numbers");
        
        System.out.print("1st number:");
        num1 = sc.nextInt();
        
        System.out.print("2nd number:");
        num2 = sc.nextInt();
  
        System.out.print("Enter the operator (+,-,*,/)");  
        char operator = sc.next().charAt(0);
        
        int cal=0;
        switch (operator) 
        {
        case '+':  
        	cal = num1 + num2;  
            break;
        case '-':  
            cal = num1 - num2;
              break;
        case '*':  
            cal= num1 * num2;  
            break;
        case '/':
            cal= num1 / num2;
            break;
        default:
            System.out.println("Invalid input");
            break;
        }
        System.out.println();
        System.out.println("The final result:");
        System.out.println(num1 + " " + operator + " " + num2 + " = " + cal);

	}

}
