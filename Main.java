import java.util.Scanner;
import java.text.NumberFormat;
public class Main
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in);
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        int capacity = 0;
        String name = "";
        int quantity;
        double price;
        ShoppingCart3 cart1 = new ShoppingCart3();

        System.out.print ("\fWelcome! Would you like to begin shopping? (Y/N): ");
        char begin = scan.nextLine ().charAt(0);

        if ( begin == 'N' || begin == 'n' )
        {
            System.out.println ("Thank you for visiting!");
        }

        if ( begin != 'n' || begin != 'n' )
        {
            while ( begin != 'n' && begin != 'N' )
            {
                System.out.print ("To begin, type in the name of the item you "
                    + "wish to buy: ");
                name = scan.nextLine ();

                System.out.print ("What is the item's price? ");
                price = scan.nextDouble ();

                System.out.print ("How many of the item would you like to buy? ");
                quantity = scan.nextInt ();
                System.out.println ();

                System.out.println ("You have completed your " + (capacity + 1) + 
                    " entry.");
                capacity++;
                scan.nextLine();

                cart1.addToCart (name, price, quantity);

                System.out.println ("-----------------------------");
                System.out.println (cart1);
                System.out.println ("-----------------------------");

                System.out.print ("Would you like to continue shopping? (Y/N): ");
                begin = scan.nextLine().charAt(0);

            }
            System.out.println ("Thank you for shopping. Here is your final item list: ");
            System.out.println ();
            System.out.println ("------------------------------");
            System.out.println (cart1);
            System.out.println ("------------------------------");
            System.out.println ();

            System.out.println ("Please pay: " + fmt.format (cart1.getTotalPrice()));
        }
    }
}

