import java.util.Scanner;

public class Calculator{
  
  public float num1,num2;
  public int ch;

  public float addNums(float n1, float n2) {
    return n1 + n2;
  }

  public float subtractNums(float n1, float n2) {
    return n1 - n2;
  }

  public float multiplyNums(float n1, float n2) {
    return n1 * n2;
  }

  public float divideNums(float n1, float n2) {
    return n1 / n2;
  }

  public float calcMod(float n1, float n2) {
    return n1 % n2;
  }

  public static void main(String[] args) {
    Calculator c = new Calculator();
    Scanner sc = new Scanner(System.in);
    System.out.println("Choose the Operation to perform:1.Addition 2.Subtraction 3.Multiplication 4.Division 5.Modulus");
    c.ch=sc.nextInt();
    System.out.println("Enter first number: ");
    c.num1 = sc.nextFloat();
    System.out.println("Enter second number: ");
    c.num2 = sc.nextFloat();
    
    
    switch(c.ch){
      case 0:
        System.out.println("Exiting...");
        System.exit(0);
        break;
      case 1:
        System.out.println("Addition: " + c.addNums(c.num1, c.num2));
        break;
      case 2:
        System.out.println("Subtraction: " + c.subtractNums(c.num1, c.num2));
        break;
      case 3:
        System.out.println("Multiplication: " + c.multiplyNums(c.num1, c.num2));
        break;
      case 4:
        System.out.println("Division: " + c.divideNums(c.num1, c.num2));
        break;
      case 5:
        System.out.println("Modulus: " + c.calcMod(c.num1, c.num2));
        break;
      default:
        System.out.println("Invalid Choice");
        break;
    }

} 
}