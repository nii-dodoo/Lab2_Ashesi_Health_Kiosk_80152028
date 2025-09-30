import java.util.Scanner;
public class HealthKiosk{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        double BMI=0;
        System.out.println("Enter a service code(P/L/T/C)");
        char service=input.nextLine().charAt(0);
        switch (service){
            case 'P':System.out.println("Go to :Pharmacy Desk");
            break;
            case 'L':System.out.println("Go to :Lab Desk");
            break;
            case 'T':System.out.println("Go to :Triage Desk");
            System.out.println("Enter the health metric: 1 for BMI \n 2 for Dosage roundup \n 3 for trig helper");
            int metric=input.nextInt();
            switch(metric){
                case 1:
            
            
                System.out.println("Enter weight(kg)");
                double weight=input.nextDouble();
                System.out.println("Enter height(meters)");
                double height=input.nextDouble();
                BMI=weight/Math.pow(height,2);
                System.out.println("BMI:"+Math.round(BMI * 10)/ 10.0);
                if(BMI<18.5){
                    System.out.println("ategory: Underweight");
                }
                else if(BMI>=18.5 && BMI<=24.9){
                    System.out.println("Category:Normal");
                }
                else if (BMI>=25&&BMI<=29.9){
                    System.out.println("Category:Overweight");
                    break;

                }

                else if (BMI>=30){
                    System.out.println("Category:Obese");
                }
                break;

                case 2:
                System.out.println("Enter the required dosage");
                double dosage=input.nextDouble();
                double tabletsNeeded = Math.ceil(dosage / 250.0);
                System.out.println("Number of tablets: " + (int)tabletsNeeded);
                break;

                case 3:
                System.out.println("Enter an angle in degrees");
                double angle = input.nextDouble();
                double sinAngle = Math.sin(Math.toRadians(angle));
                sinAngle = Math.round(sinAngle * 1000) / 1000.0;
                double cosAngle = Math.cos(Math.toRadians(angle));
                cosAngle = Math.round(cosAngle * 1000) / 1000.0;
                System.out.println("sin(" + angle + ") = " + sinAngle);
                System.out.println("cos(" + angle + ") = " + cosAngle);
                break;



            }

            break;
            case 'C':System.out.println("Go to :Counselling Desk");
            break;
            default:
            System.out.println("Invalid service code");
            break;
        }

        char randomCharacter=(char) ('A'+(int)(Math.random()*26));
        int digit1=3+ (int)(Math.random()*7);
        int digit2=3+ (int)(Math.random()*7);
        int digit3=3+ (int)(Math.random()*7);
        int digit4=3+ (int)(Math.random()*7);

        String ID= "" +randomCharacter+digit1+digit2+digit3+digit4;

        if(ID.length()!=5){
            System.out.println("Invalid length");
        }
        else if(!Character.isLetter(ID.charAt(0))){
            System.out.println("Invalid , first character must be a letter");
        }
        else if(!Character.isDigit(ID.charAt((1)))||
                !Character.isDigit(ID.charAt((2)))||
                !Character.isDigit(ID.charAt((3)))||
                !Character.isDigit(ID.charAt((4)))){
                System.out.println("Invalid: Last 4 digits must be numbers");
                }
        else{
            System.out.println("ID OK!!");
        }


    System.out.println("Enter your first name");
    String firstName=input.nextLine();
    char base=Character.toUpperCase(firstName.charAt(0));
    char shifted= (char) ('A'+(base-'A'+2)%26);
    String lastTwo=ID.substring(ID.length()-2);
    String finalID=""+shifted+lastTwo+"-"+Math.round(BMI * 10) / 10.0;
    System.out.println("Display Code:"+finalID);
                
        switch (service) {
            case 'P':
                System.out.println("PHARMACY | ID=" + ID + " | Code=" + finalID);
                break;

            case 'T':
                System.out.println("TRIAGE | ID=" + ID + " | BMI=" + BMI + " | Code=" + finalID);
                break;

            case 'L':
                System.out.println("LAB | ID=" + ID + " | Code=" + finalID);
                break;

            case 'C':
                System.out.println("COUNSELING | ID=" + ID + " | Code=" + finalID);
                break;

            default:
                System.out.println("Unknown scenario");}



    }

}