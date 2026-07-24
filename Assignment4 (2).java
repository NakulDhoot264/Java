import java.util.Scanner;

public class employee{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter Employee ID: ");
        String empid = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        String basicsalary = sc.nextLine();

        System.out.print("Enter Bonus Amount: ");
        String bonus = sc.nextLine();

       
        // Convert Strings to Wrapper Objects
        Integer empId = Integer.valueOf(empid);
        Double basicSalary = Double.valueOf(basicsalary);
        Double Bonus = Double.valueOf(bonus);

            
                
        Double netSalary = basicSalary + Bonus;

        System.out.println("\nEmployee Payroll");
        System.out.println("Employee ID   : " + empId);
        System.out.println("Basic Salary  : " + basicSalary);
        System.out.println("Bonus         : " + Bonus);
        System.out.println("Net Salary    : " + netSalary);

        sc.close();
    }
}
