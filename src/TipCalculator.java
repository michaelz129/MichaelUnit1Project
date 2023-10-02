import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.*;
import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        List<String> items = new ArrayList<>();

        //Data collection
        String item;
        double cost = 0;
        double totalCost = 0;
        System.out.println("Welcome to Tip Calculator");
        System.out.print("How many people are in your group: ");
        System.out.print("");
        int people = scan.nextInt();
        System.out.print("What is the tip percent?(0-100): ");
        int percent = scan.nextInt();

        System.out.println("----------------------------------------------------");
        //Item and cost
        System.out.print("Enter a cost in dollar and cent:");
        cost = scan.nextDouble();
        totalCost += cost;
        scan.nextLine();

        while (cost != -1) {
            System.out.print("Enter the item: ");
            item = scan.nextLine();
            items.add(item);
            System.out.print("Enter a cost in dollar and cent:");
            cost = scan.nextDouble();
            totalCost += cost;
            scan.nextLine();


        }
        System.out.println("----------------------------------------------------");
        //Output based on the user input
        totalCost += 1;
        System.out.println("Total bill before tip: " + String.format("%.2f", totalCost));
        System.out.println("Total percentage: " + percent + "%");
        double tp = totalCost * (percent / 100.00);
        System.out.println("Total tip:" + String.format("%.2f", tp));
        System.out.println("Total cost with tip: " + String.format("%.2f", (totalCost + tp)));
        System.out.println("Per person cost before tip: " + String.format("%.2f", (totalCost / people)));
        System.out.println("Tip per person: " + String.format("%.2f", (tp / people)));
        System.out.println("Total cost per person: " + String.format("%.2f", ((totalCost + tp) / people)));
        System.out.println("----------------------------------------------------");

        //Item list which user inputted
        System.out.println("Items ordered:");
        int itemsLen = items.toArray().length;
        items.forEach((n) -> System.out.println(n));
        System.out.println("----------------------------------------------------");
        //Tax(Freestyle)
        System.out.print("Would you like the tax calculated as well?(Why would there be tax on food?), (if yes enter yes if no enter no):");
        String tr = scan.nextLine();
        if (tr.equals ("yes")){
            System.out.print("Enter the tax percentage(0-100):");
            int taxPercent= scan.nextInt();
            scan.nextLine();
            double totalTax= ((taxPercent/100.00)*totalCost);
            System.out.println("Tax Percentage:" + taxPercent + "%");
            System.out.println("Total Tax: " + String.format("%.2f", totalTax));
            System.out.println("Total cost with tax(excluding tip): " + String.format("%.2f", (totalCost+totalTax)));
            System.out.println("Total cost including both tax and tip: " + String.format("%.2f", (totalTax+totalCost+tp)));
            System.out.println("Total cost per person including both tax and tip: "+ String.format("%.2f", ((totalTax+totalCost+tp)/people)));
        }
        else{
            System.out.println("Why would there be tax on food?, might as well go home and cook way cheaper");
        }

        System.out.println("----------------------------------------------------");
        //Freestyle Part 2, Formulas
        System.out.print("Would you like to know the basic formula that was used in these calculation?,(if yes enter yes if no enter no): ");
        String fr = scan.nextLine();
        if (fr.equals("yes")){
            System.out.println("Formulas(Not the best)");
            System.out.println("Basic Variables:tc = total cost(without tip or tax), p= people,i=each item cost, t = tax or tip percent");
            System.out.println("tc =i+i+i,until all the i is added");
            System.out.println("Tax or Tip = tc*(t/100),t is divide by 100 since it's a percentage and needs to be changed to decimal form");
            System.out.println("Total Cost with tax or tip = tc+tc*(t/100), assuming if you're adding both just find the tax and tip individually and add them to total cost ");
            System.out.println("Total cost with tax and tip = tc+tc*(t1/100)+tc*(t2/100), t1 is tax and t2 is tip can be verse vice just don't add the total cost twice");
            System.out.println("Total cost or tax or tip per person is found by x(tc or t)/p, if x is Total cost with tax or tip or with both it would also work");
            System.out.println("It would be easier if you just look it up on the internet, well this is simple math so perhaps you should of know it already");
        }
        else{
            System.out.print("It's basic calculation so you may have already know it, if you don't searching on the internet would of been a better choice the formula that was going to shown is not the best(in terms of organization) ");
        }
        System.out.println("----------------------------------------------------");

        System.out.print("Bye, why do you even need to use this calculation much easier to do it by yourself");
    }
}

