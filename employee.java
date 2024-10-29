import java.util.Scanner;

public class employee {
    String name;
    int joining_year;
    String address;
    int salary;

    public void getEmployee(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        name = sc.nextLine();
        System.out.println("Enter the address:");
        address = sc.nextLine();
        System.out.println("Enter the joining year:");
        joining_year = sc.nextInt();
        System.out.println("Enter salary:");
        salary = sc.nextInt();
    }
    public void showEmployee(){
        System.out.println( "NAME:" + name);
        System.out.println("address:" + address);
        System.out.println("Joining year" + joining_year);
        System.out.println("salary:" + salary);
    }
    public void searchEmployee(String name){ ///////////////////////
         if (name.equals(this.name)){
            showEmployee();
         }
    }
    public void updateEmployee(String name){
        if(name.equals(this.name)){
            getEmployee();
        }
    }

// public class employeeoop{
    public static void main(String[] args) {
        // employee e = new employee();
        // e.getEmployee();
        employee[] e = new employee[5];
        for (int i=0;i<2;i++){
            e[i] = new employee();
            e[i].getEmployee();
        }
        System.out.println("DETAILS OF EMPLOYEE");
        for(int i = 0 ;i<2 ;i++){
            e[i].showEmployee();
        }
        System.out.println("Enter name to search");
        Scanner s=new Scanner(System.in);
        String name1=s.nextLine();
        for(int i = 0 ;i<2 ;i++){
            e[i].searchEmployee(name1);
        }

        System.out.println("Enter name to update");
        String name2=s.nextLine();
        for(int i = 0 ;i<2 ;i++){
            e[i].updateEmployee(name2);
        }
    }
}
