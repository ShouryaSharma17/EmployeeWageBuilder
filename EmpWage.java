import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class EmpWage {

    public static void main(String[] args) {
        array_wage builder = new array_wage();
        builder.wage_array_injection("Tesla",14,7,40);
        builder.wage_array_injection("Amazon",15,8,50);
        builder.wage_array_injection("Apple",12,5,83);
        builder.wage_array_injection("Netflix",10,4,68);
        builder.wage_array_injection("Deep Mind",16,9,72);

        builder.print_array_wage();


    }
}
    //class instance
  class array_wage {
     int array_counter = 0;
     Employee_check[] wage_array;
        // Initializing array
     public void array_wage() {
         wage_array = new Employee_check[10];
     }
        // Use of INJECTION to enter array elements
     public void wage_array_injection(String company_name, int working_hours, int part_time_hrs, int wage_per_hr) {

         wage_array[array_counter] = new Employee_check(company_name, working_hours, part_time_hrs, wage_per_hr);

         array_counter++;

     }
    // Printing array
     public void print_array_wage() {
         for (int i =0 ; i < array_counter ;i++) {

             System.out.println(wage_array[i].attendance());

         }
     }


 }

     class Employee_check {
         String company_name;
         int working_hours;
         int work_days;
         int absent_counter;
         int part_time_counter;
         int full_time_counter;
         int wage_per_hr;
         //Initializing variable(part time hour)
         int part_time_hrs;
         int wage_today;
         int total_work_hrs;
         Random check = new Random();

         Employee_check(String company_name, int a, int b, int c) {
             this.company_name = company_name;

             this.working_hours = a;
             this.work_days = 0;
             this.absent_counter = 0;
             this.part_time_counter = 0;
             this.full_time_counter = 0;
             this.wage_per_hr = c;
             this.part_time_hrs = b;
             this.total_work_hrs = 0;
             this.wage_today = 0;
         }

         //Defining method
         public List<Serializable> attendance() {

             //int checker =check.nextInt(3);

             while (total_work_hrs < 100 && work_days < 20) {

                 int checker = check.nextInt(3);
                 // Switch case to mark attendance
                 switch (checker) {
                 	case 0:
                         absent_counter += 1;
                         break;
                    case 1:
                         wage_today = working_hours * wage_per_hr;
                         total_work_hrs += 8;
                         full_time_counter += 1;
                         work_days += 1;
                         break;
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
             // Using aslist method to return name and integer
             return Arrays.asList(company_name,wage_total);

         }

     }


