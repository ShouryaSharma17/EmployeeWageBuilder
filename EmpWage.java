import java.util.Random;

public class EmpWage {

        public static int calculateEmpWage(){
            Random random = new Random();
            
            //constants
            int FULL_DAY_HR = 8;
            int PART_TIME_HR = 4;
            int WAGE_PER_HR = 20;
            int MAX_WORKING_DAYS = 20;
            int MAX_HR = 100;

            //variables
            int totalWorkingDays = 0;
            int empHr = 0;
            int totalWageOfMonth = 0;
            int salary=0;
            int totalEmpHr=0;
            //Calculation Part
            while (totalWorkingDays < MAX_WORKING_DAYS &&  totalEmpHr<= MAX_HR) {
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
                salary=empHr*WAGE_PER_HR;
                totalWageOfMonth += salary;
                System.out.println("Day#: " +totalWorkingDays+" Emp Hrs: "+empHr+" Emp Wages: "+salary);
            }

            System.out.println("salary for the month is " + totalWageOfMonth);
            return totalWageOfMonth;
        }
        public static void main(String args[]){
            calculateEmpWage();
        }
    }

