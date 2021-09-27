import java.text.NumberFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;

    public class TipCalculator
    {
        static Scanner userInput = new Scanner(System.in);
        private static String userNumber;

        public static void main(String[] args)
        {

            NumberFormat formatter = NumberFormat.getCurrencyInstance();
            System.out.println("Welcome to Apurv's Tip Calculator!");
            System.out.println("How much is your total bill, including tax?  ");
            double billTotal = userInput.nextDouble();

            //Get User data on how much to tip
            System.out.println("Recommended tip: 10% - 20%");
            System.out.println("What percentage would you like to tip your server? Use whole number please!");
            int tipAmount = userInput.nextInt();

            // Calculate tip Amount
            double total = billTotal * tipAmount / 100;

            // Display how much the tip will be
            System.out.println("Your tip will be " + (formatter.format(total)));

            //Display what the total amount of bill and tip is
            System.out.println("Your total bill with the tip is " + (formatter.format(billTotal + total)));

            //Splitting the check
            System.out.println("Do you want to split the check? If yes, type Y, If no, type N  ");
            double grandTotal = billTotal + total;

            if (userInput.next().equalsIgnoreCase("Y"))
            {
                System.out.println("How many people would you like to split the bill with?");
                int split = userInput.nextInt();

                //Move this grandTotal up to the total bill portion..........
                double splitTotal = grandTotal / split;
                System.out.println("Your bill split " + split + " ways comes to a total of " + (formatter.format(splitTotal)) + " each.");

            } else {
                System.out.println("Your total bill with tip is " + (formatter.format(grandTotal)));
            }
        }

        public static int tipAmount()
        {
            try{
    Integer.parseInt(userNumber) ;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, e, "Exception", JOptionPane.ERROR_MESSAGE);
            }
                return 0;
        }
}
