
/**
 * Class Item - an item that could be placed in each room.
 *
 * @author Riya Arora (101190033)
 * @version June 15, 2022
 */
public class Item
{
    // Weight of the item
    private double weight;
    
    // String description of the item
    private String description;

    /**
     * Constructor for objects of class Item
     * 
     * @param description  A description of the item
     * @param weight The weight of the item
     */
    public Item(String description, double weight)
    {
        this.description = description;
        this.weight = weight;
    }

    /**
     * Returns the string representation of the item including the description and weight. 
     * 
     * @return  A string description of the item
     */
    public String getDescription()
    {
        return "a "  + description + " that weighs " + weight + " kg.";
    }
}
