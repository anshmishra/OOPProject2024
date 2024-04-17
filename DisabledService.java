/**
 * Class to calculate discount fare for disabled citizens.
 */

public class DisabledService {
	/**
	 *  Discount rate. Here, it is 55% discount.
	 */
    public static final double DISCOUNT_RATE=0.55;
    /**
     * Method to calculate discount fare for disabled citizens.
     * @param fare: the pre-discount fare
     * @return the discount fare 
     */
    public double calculateDiscount(double fare){
        return fare*(1-DISCOUNT_RATE);
    }
}
