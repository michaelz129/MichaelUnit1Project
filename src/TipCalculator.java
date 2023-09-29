import java.text.DecimalFormat;
import java.util.Scanner;
public class TipCalculator {
    public static void main(String[]arg){
    Scanner scan = new Scanner(System.in);
    double cost = 0 ;
    double totalCost = 0;
    System.out.println("Welcome to Tip Calculator");
    System.out.print("How many people are in your group: ");
    System.out.print("");
    int people = scan.nextInt();
    System.out.print("What is the tip percent?0-100: ");
    double percent = scan.nextInt();
    while(cost != -1){
        totalCost+=cost;
        System.out.print("Enter a cost in dollar and cent:");
        cost=scan.nextDouble();

    }
    System.out.println("Total bill before tip: " + String.format("%.2f",totalCost));
    System.out.println("Total percentage: " + percent+ "%");
    double tp = totalCost*(percent/100);
    double ppcbt = totalCost/people;//per person cost before tip
    System.out.println("Total tip:" + tp);
    System.out.println("Total cost with tip: " + String.format("%.2f",(totalCost+tp)));
    System.out.println("Per person cost before tp: " + ppcbt);
    System.out.println("Tip per person: " + tp/people);
    System.out.print("Total cost per person: " + String.format("%.2f",((totalCost+tp)/people)));


    }
}
