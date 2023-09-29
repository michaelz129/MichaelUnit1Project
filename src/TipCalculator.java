import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.*;
import java.util.Scanner;
public class TipCalculator {
    public static void main(String[]arg){
    Scanner scan = new Scanner(System.in);
    List <String> items = new ArrayList<>();
    String item = "--------------------------------------------";
    double cost = 0 ;
    double totalCost = 0;
    System.out.println("Welcome to Tip Calculator");
    System.out.print("How many people are in your group: ");
    System.out.print("");
    int people = scan.nextInt();
    System.out.print("What is the tip percent?0-100: ");
    double percent = scan.nextInt();
    System.out.print("Enter a cost in dollar and cent:");
    cost=scan.nextDouble();
    totalCost+=cost;
    scan.nextLine();



    while(cost != -1){
        System.out.print("Enter the item: ");
        item = scan.nextLine();
        items.add(item);
        System.out.print("Enter a cost in dollar and cent:");
        cost=scan.nextDouble();
        totalCost+=cost;
        scan.nextLine();




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

    System.out.print("Items ordered:");
    int itemsLen = items.toArray().length;
    int i = 0;
    for (i < itemsLen){
        system.out.println(items(i));
    }




    }
}
