import java.util.*;

public class EmpWage {
    public static void main(String args[]) {
        Random random = new Random();
        //int EMP_IS_PRESENT = 1;
        // int PART_TIME = 2;
        int PART_TIME_HR = 4;
        int WAGE_PER_HR = 20;
        int FULL_DAY_HR = 8;
        int WORKING_DAYS = 20;
        int empHr = 0;
        int sum = 0;
        int totalWageOfMonth = 0;

        int salary = 0;
        for (int i = 1; i <= WORKING_DAYS; i++) {
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
            salary = empHr * WAGE_PER_HR;
            totalWageOfMonth+=salary;
            System.out.println("salary for the day is " + salary);
        }
        System.out.println("salary for the month is " + totalWageOfMonth);
    }
}

