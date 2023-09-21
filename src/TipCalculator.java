import java.util.Scanner;
public class TipCalculator {
    public static void main(String[]arg){
    Scanner scan = new Scanner(System.in);
    double cost = 0 ;
    double totalCost = 0;
    System.out.println("Welcome to Tip Calculator");
    System.out.print("How many people are in your group: ");
    System.out.print();
    int people = scan.nextInt();
    System.out.print("What is the tip percent?0-100: ");
    double percent = scan.nextInt();
    while(cost != -1){
        totalCost+=cost;
        System.out.print("Enter a cost in dollar and cent");
        cost=scan.nextDouble();

    }
    System.out.println("Total bill before tip: " + totalCost);
    System.out.println("Total percentage: " + percent+ "%'");
    double tp = totalCost*(percent/100);
    System.out.print("Total tip:" + tp);
    System.out.print("Total cost with tip: " + totalCost+tp);


    }
}
