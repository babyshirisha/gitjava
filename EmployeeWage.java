package com.bridgelabz.employeewage;

public class EmployeeWage {
    public static void main(String[] args) {
        EmployeeWage employee = new EmployeeWage();
        int option = (int)((Math.random() *10)%2+1);
        switch (option) {
            case 1 : employee.fullTimeEmployee();
            break;
            case 2 : employee.partTimeEmployee();
            break;
        }
    }
    public void fullTimeEmployee(){
        int employeeWagePerHr=20;
        int DayHr=8;
        int employeeworkingdays=20;
        int wage = 0;
        int attendance = (int)((Math.random() *10)%2);
        if(attendance == 0) {
            System.out.println("Employee is present");
                int empFullWage = employeeWagePerHr * DayHr;
                System.out.println("Daily Employee Wage:" +empFullWage);
                int employeemonthwage = empFullWage * employeeworkingdays;
                System.out.println("Employee monthly salary: " + employeemonthwage);
            while(wage != 100){
                
            }
        }
        else
            System.out.println("Employee is absent");
    }
    public void partTimeEmployee(){
        int employeeWagePerHr1=20;
        //int DayHr1=8;
        int employeeworkingdays1=20;
        int attendance = (int)((Math.random() *10)%2);
        int workingHr = (int)((Math.random() *10)%8+1);
            if (attendance == 0) {
                System.out.println("Part time Employee is present");
                System.out.println("Employee Working Hr: " + workingHr);
                int empFullWage1 = employeeWagePerHr1 * workingHr;
                System.out.println("Daily Wage of Part time Employee:" + empFullWage1);
                int employeemonthwage1 = empFullWage1 * employeeworkingdays1;
                System.out.println("Part time Employee monthly salary: " + employeemonthwage1);

            } else
                System.out.println("Part Time Employee is absent");
    }

}
