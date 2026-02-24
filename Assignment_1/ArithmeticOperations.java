import java.util.Scanner;

public class ArithmeticOperations {

  public float num1, num2;

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
    ArithmeticOperations op = new ArithmeticOperations();
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter first number: ");
    op.num1 = sc.nextFloat();

    System.out.println("Enter second number: ");
    op.num2 = sc.nextFloat();

    float sum = op.addNums(op.num1, op.num2);
    float diff = op.subtractNums(op.num1, op.num2);
    float prod = op.multiplyNums(op.num1, op.num2);
    float div = op.divideNums(op.num1, op.num2);
    float mod = op.calcMod(op.num1, op.num2);

    System.out.println("Addition: " + sum);
    System.out.println("Subtraction: " + diff);  
    System.out.println("Multiplication: " + prod);
    System.out.println("Division: " + div);
    System.out.println("Modulus: " + mod);

  }
}
