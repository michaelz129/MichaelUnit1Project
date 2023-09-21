import java.util.Scanner;
public class TipCalculator {
    public static void main(String[]arg){
    Scanner scan = new Scanner(System.in);
    double cost = 0 ;
    double totalCost = 0;
    System.out.println("Welcome to Tip Calculator");
    System.out.print("How many people are in your group: ");
    int people = scan.nextInt();
    System.out.println("What is the tip percent?0-100: ");
    double percent = scan.nextInt()/100;
    while(cost != -1){
        System.out.print("Enter a cost in dollar and cent");
        cost=scan.nextDouble();
        totalCost+=cost;
    }
    System.out.println(totalCost);

    }
}
