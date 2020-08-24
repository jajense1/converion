import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Do you need to convert Dollars to Euros or Euros to Dollars? (D or E)");
    String currency;
    currency = sc.nextLine();
    if ( currency.contains("D"))
    System.out.println("Enter your dollar amount.");
    else
    System.out.println("Enter your Euro amount.");
  
    double money = sc.nextDouble();
    if (currency.contains("D"))
    System.out.println("The Euro conversion is " + (money/1.18));
    else
    System.out.println("The Dollar conversion is " + (money*1.18));
    
  }
}