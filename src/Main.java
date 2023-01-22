import java.text.NumberFormat;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
       final byte percent = 100;
       final byte monthsInYear = 12;


       Scanner scanner = new Scanner(System.in);
       System.out.print("Principal: ");
       int loan = scanner.nextInt();

       System.out.print("Annual Interest Rate: ");
       double rate = scanner.nextDouble();
       double calculateMonthlyRate = (rate / percent) / monthsInYear;

       System.out.print("Period (Years)");
       byte years = scanner.nextByte();
       int numberOfPayments = years * monthsInYear;


       double mortgage = loan * (calculateMonthlyRate * Math.pow(1 + calculateMonthlyRate,numberOfPayments) / (Math.pow(1 + calculateMonthlyRate, numberOfPayments) - 1));

       String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

       System.out.print("Mortgage: " + mortgageFormatted);


    }
}