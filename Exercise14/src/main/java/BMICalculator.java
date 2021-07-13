

import java.util.Scanner;

public class BMICalculator {
    public double bmiCal(){
        double bmi = 0;
        double height = 0;
        double weight = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your height:");
        height = sc.nextDouble();

        while(height<=0){
            try{
                System.out.println("Invalid number. Please enter your height:");
                height = sc.nextDouble();


            }catch (Exception exception){
                System.out.println("The height must be a number. ");
                break;
            }
        }
        System.out.println("Enter your weight:");
        weight = sc.nextDouble();
        while (weight <=0){
            try{
                System.out.println("Invalid number. Please enter your weight: ");
                weight = sc.nextDouble();
            }catch( Exception ex){
                System.out.println("The weight must be a number. ");
                break;
            }
        }
        bmi = weight/ height*height;
        return bmi;
    }

    public void BMI(){
        double  bmi= bmiCal();
        if (bmi < 18.5){
            System.out.println("You are underweight");
        }else if(bmi >=18.5 && bmi<25){
            System.out.println("You are normal");
        }else{
            System.out.println("You are overweight");
        }

    }
}
