import java.io.Serializable;
import java.util.*;

interface Employee_check {


    public List<Serializable> attendance();

}

public class EmpWage {

    public static void main(String[] args) {
        // Declaring new instance
        array_wage builder = new array_wage();
        // instantiating builder objects and passing arguments
        builder.wage_array_injection("Tesla", 14, 7, 40);
        builder.wage_array_injection("Amazon", 15, 8, 50);
        builder.wage_array_injection("Apple", 12, 5, 83);
        builder.wage_array_injection("Netflix", 10, 4, 68);
        builder.wage_array_injection("Deep Mind", 16, 9, 72);
        System.out.println("[COMPANY NAME, TOTAL WAGE]");
        builder.print_array_wage();
    }
}

class array_wage {
    int array_counter = 0;
    // Arraylist
    List<Employee_check_child> wage_array = new ArrayList<>();
    Employee_check_child performer = new Employee_check_child();

    // Using injection method 
    public void wage_array_injection(String company_name, int working_hours, int part_time_hrs, int wage_per_hr) {

        wage_array = Collections.singletonList(new Employee_check_child(company_name, working_hours, part_time_hrs, wage_per_hr));
        performer.attendance();
        wage_array.add(performer);


    }

    //Prints the arraylist
    public void print_array_wage() {
        {

            System.out.println(wage_array);

        }
    }

}

class Employee_check_child implements Employee_check {


    String company_name;
    int working_hours;
    int work_days;
    int absent_counter;
    int part_time_counter;
    int full_time_counter;
    int wage_per_hr;
    //Initializing part time hours
    int part_time_hrs;
    int wage_today;
    int total_work_hrs;

    Employee_check_child() {

        this.company_name = company_name;

        this.working_hours = working_hours;
        this.work_days = 0;
        this.absent_counter = 0;
        this.part_time_counter = 0;
        this.full_time_counter = 0;
        this.wage_per_hr = wage_per_hr;
        this.part_time_hrs = part_time_hrs;
        this.total_work_hrs = 0;
        this.wage_today = 0;
    }


    Employee_check_child(String company_name, int working_hours, int part_time_hrs, int wage_per_hr
    ) {

        this.company_name = company_name;

        this.working_hours = working_hours;
        this.work_days = 0;
        this.absent_counter = 0;
        this.part_time_counter = 0;
        this.full_time_counter = 0;
        this.wage_per_hr = wage_per_hr;
        this.part_time_hrs = part_time_hrs;
        this.total_work_hrs = 0;
        this.wage_today = 0;
    }

    //Defining method
    public List<Serializable> attendance() {

        //int checker =check.nextInt(3);
        Random check = new Random();
        while (total_work_hrs < 100 && work_days < 20) {

            int checker = check.nextInt(3);
            // Use of switch to mark attendance
            switch (checker) {
                case 0:
                    break;
                case 1:
                    wage_today = working_hours * wage_per_hr;
                    total_work_hrs += 8;
                    work_days += 1;
                    break;
                case 2:
                    wage_today = working_hours * wage_per_hr;
                    total_work_hrs += 4;
                    work_days += 1;
                    break;
                default:
                    break;
            }


        }

        int wage_total = total_work_hrs * wage_per_hr;
        return Arrays.asList(company_name, wage_total);

    }

}

