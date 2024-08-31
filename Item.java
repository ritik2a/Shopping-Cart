import java.text.NumberFormat;
public class Item
{
    private String name;
    private double price;
    private int quantity;

    /**
     * Creates an item with the given attributes.
     * @param itemName name of item.
     * @param itemPrice price of item.
     * @param numPurchased quantity purchased.
     */
    public Item (String itemName, double itemPrice, int numPurchased)
    {
        name = itemName;
        price = itemPrice;
        quantity = numPurchased;
    }

    /**
     * Returns a string representation of the item.
     * @return string representation.
     */
    public String toString ()
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return (name + "\t\t" + fmt.format(price) + "\t\t" + quantity + "\t\t"
            + fmt.format(price*quantity));
    }

    /**
     * Accessor method for the price instance variable.
     * @return price of the item.
     */
    public double getPrice()
    {
        return price;
    }

    /**
     * Accessor method for the name instance variable.
     * @return name of the item.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Accessor method for the quantity instance variable.
     * @return quantity of the item.
     */
    public int getQuantity()
    {
        return quantity;
    }
}