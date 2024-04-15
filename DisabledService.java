public class DisabledService {
    public static final double DISCOUNT_RATE=0.55;

    public double calculateDiscount(double fare){
        return fare*(1-DISCOUNT_RATE);
    }
}
