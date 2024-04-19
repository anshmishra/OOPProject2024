import java.io.Serializable;
public class StudentService implements SpecialService, Serializable{
    private static final double DISCOUNT_RATE=0.3;

    //OVERRIDE
    public double calculateDiscount(double fare){
        return fare*(1-DISCOUNT_RATE);
    }
}
