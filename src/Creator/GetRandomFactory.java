package Creator;
import java.util.Random;

import Product.*;

public class GetRandomFactory implements Creator {

     String stringPlan;

    public String planName()
    {
        return stringPlan;
    }

    @Override
    public Plan getPlan() {
        Random random = new Random();
        int number = random.nextInt()%4;
        switch(number) {
            case 0:
                System.out.println("Commercial plan has ben used");
                stringPlan = "Commercial plan";
                return new CommercialPlan();
            case 1:
                System.out.println("Domestic plan has ben used");
                stringPlan = "Domestic plan";
                return new DomesticPlan();
            case 2:
                System.out.println("Institutional plan has ben used");
                stringPlan = "Institutional plan";
                return new InstitutionalPlan();
            case 3:
                System.out.println("Special plan has ben used");
                stringPlan = "Special plan";
                return new SpecialPlan();
            default:
                return null;
        }
    }
}
