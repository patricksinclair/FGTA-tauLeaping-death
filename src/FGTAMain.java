import java.util.ArrayList;
import java.util.Random;

public class FGTAMain {
    public static void main(String[] args){

        double specific_alpha = Math.log(11.5)/500.;
        BioSystem.expGrad_popAndgRateDistbs(specific_alpha);
    }
}
