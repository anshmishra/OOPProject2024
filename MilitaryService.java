public class MilitaryService implements SpecialService {
    private static final double DISCOUNT_RATE=0.5;

    public double calculateDiscount(double fare){
        return fare*(1-DISCOUNT_RATE);
    }
}



