import java.util.*;

public class EmpWage {

        public static int calculateEmpWage(String companyName, int wagePerHr, int maxWorkingDays, int maxHr){
            Random random = new Random();
            
            //constants
            int FULL_DAY_HR = 8;
            int PART_TIME_HR = 4;
            
            //variables
            int totalWorkingDays = 0;
            int empHr = 0;
            int totalWageOfMonth = 0;
            int salary=0;
            int totalEmpHr=0;
            
            //Calculation Part
            while (totalWorkingDays < maxWorkingDays &&  totalEmpHr<= maxHr) {
                totalWorkingDays++;
                int ranNum = random.nextInt(3);

                switch (ranNum) {
                    case 1:
                        empHr = FULL_DAY_HR;
                        break;

                    case 2:
                        empHr = PART_TIME_HR;
                        break;

                    default:
                        empHr = 0;
                        break;
                }
                salary=empHr*wagePerHr;
                totalWageOfMonth += salary;
                
            }
            
            System.out.println("salary for the month for Company "+companyName+" is "+ totalWageOfMonth);
            return totalWageOfMonth;
        }
        public static void main(String args[]){
            calculateEmpWage("Dmart",10,25,150);
            calculateEmpWage("Reliance",20,20,100);
        }
    }


