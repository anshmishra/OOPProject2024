/**
 * Class to calculate discount fare for military personnel.
 */

public class MilitaryService implements SpecialService {
	/**
	 *  Discount rate. Here, it is 50% discount.
	 */
	private static final double DISCOUNT_RATE=0.5;
    /**
     * Method to calculate discount fare for military personnel.
     * @param fare: the pre-discount fare
     * @return the discount fare 
     */
    public double calculateDiscount(double fare){
        return fare*(1-DISCOUNT_RATE);
    }
}



