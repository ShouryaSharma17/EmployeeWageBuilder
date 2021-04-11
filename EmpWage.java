import java.util.*;


public class EmpWage {

    public static void main(String[] args) {
        // Creating an Instance of class Employee_check
        Employee_check first_emp = new Employee_check();
        Employee_check walmart_emp = new Employee_check();
	Employee_check apple_emp = new Employee_check();
        Employee_check tesla_emp = new Employee_check();
	
	//Using instance varables to calculate wages
        first_emp.company_name = "AMAZON";
        first_emp.working_hours = 10;
        first_emp.part_time_hrs = 7;
        first_emp.wage_per_hr = 35;

        walmart_emp.company_name = "WALMART";
        walmart_emp.working_hours = 14;
        walmart_emp.part_time_hrs = 9;
        walmart_emp.wage_per_hr = 25;

        apple_emp.company_name = "APPLE";
        apple_emp.working_hours = 9;
        apple_emp.part_time_hrs = 5;
        apple_emp.wage_per_hr = 65;

        tesla_emp.company_name = "TESLA";
        tesla_emp.working_hours = 7;
        tesla_emp.part_time_hrs = 3;
        tesla_emp.wage_per_hr = 45;


        // Method Calling
        System.out.println("FIRST EMPLOYEE :");
        first_emp.attendance();
        System.out.println("WALMART EMPLOYEE:");
        walmart_emp.attendance();
        System.out.println("APPLE EMPLOYEE:");
        apple_emp.attendance();
        System.out.println("TESLA EMPLOYEE:");
        tesla_emp.attendance();

    }


    public static class Employee_check {

        String company_name;
        int working_hours;
        int work_days = 0;
        int absent_counter = 0;
        int part_time_counter = 0;
        int full_time_counter = 0;
        int wage_per_hr;
        //Initializing variable (part time hours)
        int part_time_hrs;
        int wage_today = 0;
        int total_work_hrs = 0;


        Random check = new Random();

        //Defining attendance method
        public void attendance() {

            //int checker =check.nextInt(3);

            while (total_work_hrs < 100 && work_days < 20) {

                int checker = check.nextInt(3);
                // Using switch to mark attendance
                switch (checker) {
                    // Absent case
                    case 0:
                        absent_counter += 1;
                        break;
                    // Full time Case
                    case 1:
                        wage_today = working_hours * wage_per_hr;
                        total_work_hrs += 8;
                        full_time_counter += 1;
                        work_days += 1;
                        break;
                    // Part time Case
                    case 2:
                        wage_today = working_hours * wage_per_hr;
                        total_work_hrs += 4;
                        part_time_counter += 1;
                        work_days += 1;
                        break;
                    default:
                        break;
                }


            }

            int wage_total = total_work_hrs * wage_per_hr;
            System.out.println("THE EMPLOYE WORKED FOR " + work_days + " DAYS AND " + total_work_hrs + " HOURS");
            System.out.println("THE EMPLOYE WAS ABSENT FOR " + absent_counter + " DAYS");
            System.out.println("THE EMPLOYEE WORKED " + part_time_counter + " PART TIME DAYS");
            System.out.println("THE EMPLOYEE WORKED " + full_time_counter + " FULL TIME DAYS");
            System.out.println("THE TOTAL WAGE IN THIS MONTH IS " + wage_total + "\n");

        }

    }

}

