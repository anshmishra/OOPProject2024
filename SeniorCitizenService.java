/**
 * Class to calculate discount fare for senior citizens.
 * 
 */

public class SeniorCitizenService implements SpecialService {
	/**
	 *  Discount rate. Here, it is 40% discount.
	 */
    private static final double DISCOUNT_RATE=0.4;
    /**
     * Method to calculate discount fare for senior citizens.
     * @param fare: the pre-discount fare
     * @return the discount fare 
     */
    public double calculateDiscount(double fare){
        return fare*(1-DISCOUNT_RATE);
    }
}
