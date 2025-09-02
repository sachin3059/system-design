public class Employee {

    private int id;   // employee id
    private String  name;

    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }


    public void printPerformanceReport(){
        // code to print performance report
        System.out.println("Performance report of the employee: " + name);
    }

    public double computeSalary(){
        // code to compute salary
        return 1000.0;
    }


    public void updateEmployeeData(){
        // code to update employee data
        System.out.println("Employee data updated successfully");
    }

    public void fetchEmployeeData(){
        // code to fetch employee data
        System.out.println("Employee data fetched successfully");
    }
}


// what are the issues in this employee class?
// list down all the issues?