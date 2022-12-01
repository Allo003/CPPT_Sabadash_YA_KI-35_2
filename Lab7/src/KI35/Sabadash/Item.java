package KI35.Sabadash;

/**
 * Interface<code>Item</code> that contain method for all items
 *
 * @author Sabadash Yurii KI-35
 * @version 1.0
 */
public interface Item extends Comparable<Item> {
    /**
     * Method to get weight of  item
     *
     * @return The weight of item
     */
    public int getWeight();

    /**
     * Method to get info of item
     */
    public void printInfo();
}
