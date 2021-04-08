import java.util.*;

public class EmpWage {

    public static void main(String[] args) {
        {
            Random random = new Random();
            int Num = random.nextInt(2);

            if (Num == 0) {
                System.out.println("employee is absent");
            } else {
                System.out.println("employee is present");
            }
        }
    }
}
