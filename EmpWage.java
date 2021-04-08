import java.util.*;

public class EmpWage {
	public static void main(String args[]) {
        Random random = new Random();
        int ranNum = random.nextInt(2);
        int EMP_IS_PRESENT = 1;
        int WAGE_PER_HR = 20;
        int salary = 0;
        int FULL_DAY_HR = 8;

        if (ranNum == 0) {
                System.out.println("employee is absent");
            } else {
                System.out.println("employee is present");
            }
        if (ranNum == EMP_IS_PRESENT) {
            salary = WAGE_PER_HR * FULL_DAY_HR;
            System.out.println("salary for the day is " + salary);
        } else {
            salary = 0;
            System.out.println("salary for the day is " + salary);
        }
    }
}
