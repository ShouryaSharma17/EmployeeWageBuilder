import java.util.*;

public class EmpWage {
    public static void main(String args[]) {
        Random random = new Random();
        int ranNum = random.nextInt(3);
        //int EMP_IS_PRESENT = 1;
        // int PART_TIME = 2;
        int PART_TIME_HR = 4;
        int WAGE_PER_HR = 20;
        int FULL_DAY_HR = 8;
        int empHrs=0;

        switch (ranNum) {
            case 1:
                empHrs=FULL_DAY_HR;
                break;

            case 2:
                empHrs=PART_TIME_HR;
                break;

            default:
                empHrs=0;
                break;
        }
        int salary = empHrs * WAGE_PER_HR;
        System.out.println("salary for the day is " + salary);
    }
}

