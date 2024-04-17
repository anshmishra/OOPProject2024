/**
 * Class to calculate discount fare for students.
 * 
 */


public class StudentService implements SpecialService{
	/**
	 *  Discount rate. Here, it is 20% discount.
	 */
	private static final double DISCOUNT_RATE=0.2;

    //OVERRIDE
    /**
     * Method to calculate discount fare for students.
     * @param fare: the pre-discount fare
     * @return the discount fare 
     */
    public double calculateDiscount(double fare){
        return fare*(1-DISCOUNT_RATE);
    }
}
