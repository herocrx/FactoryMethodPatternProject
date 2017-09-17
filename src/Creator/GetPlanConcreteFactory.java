package Creator;

import Product.*;

public class GetPlanConcreteFactory implements Creator{

    String planType;

    public GetPlanConcreteFactory(String planType) {
        this.planType = planType;
    }

    //use getPlan method to get object of type Plan
    public Plan getPlan(){
        switch(planType){
            case "DOMESTICPLAN":
                return new DomesticPlan();
            case "COMMERCIALPLAN":
                return new CommercialPlan();
            case "INSTITUTIONALPLAN":
                return new InstitutionalPlan();
            case "SPECIALPLAN":
                return new SpecialPlan();
            default:
                return null;
        }

    }
}//end of GetPlanFactory class.