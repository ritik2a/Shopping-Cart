import java.text.NumberFormat;
import java.util.ArrayList;

public class ShoppingCart3
{
    private double totalPrice; 
    private ArrayList<Item> cart;

    /**
     * Constructor method
     * Creates a shopping cart with a capacity of five items.
     */
    public ShoppingCart3()
    {
        totalPrice = 0.0;
        cart = new ArrayList<Item>();
    }

    /**
     * Adds an item to the shopping cart.
     * @param itemName name of item
     * @param price price of item
     * @quantity how much of one item
     */
    public void addToCart(String itemName, double price, int quantity)
    {
        cart.add(new Item (itemName, price, quantity));
        totalPrice += price * quantity;
    }

    /**
     * Creates a string representation of the cart.
     * @return string representation
     */
    public String toString()
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        String contents = "\nShopping Cart\n";
        contents += "\nItem\t\tUnit Price\tQuantity\tTotal\n";
        for (int i = 0; i < cart.size(); i++)
            contents += cart.get(i).toString() + "\n";
        contents += "\nTotal Price: " + fmt.format(totalPrice);
        contents += "\n";
        return contents;
    }

    /**
     * Accessor method for the total price.
     * @return totalPrice total price of the cart's contents.
     */
    public double getTotalPrice()
    {
        return totalPrice;
    }
}
