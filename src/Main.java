import java.io.*;
import Creator.*;
import Product.*;
class Main{
    public static void main(String args[])throws IOException{


        System.out.print("Enter the name of plan for which the bill will be generated: ");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String planName=br.readLine();
        System.out.print("Enter the number of units for bill will be calculated: ");
        int units=Integer.parseInt(br.readLine());

        System.out.println("Use case 1");
        System.out.println("Concrete plan factory");
        Creator planFactory = new GetPlanConcreteFactory(planName);
        Plan p1 = planFactory.getPlan();
        //call getRate() method and calculateBill()method of DomesticPaln.
        System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");
        p1.calculateBill(units);

        System.out.println("\nUse case 2");
        System.out.println("Random plan factory");
        Creator randomPlanFactory = new GetRandomFactory();
        Plan p2 = randomPlanFactory.getPlan();
        //call getRate() method and calculateBill()method of DomesticPaln.
        System.out.print("Bill amount of random plan is: ");
        p2.calculateBill(units);

    }
}//end of GenerateBill class.