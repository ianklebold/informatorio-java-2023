package org.info.kiss.usepolymorphism.domain;

public class PartTimeEmployee extends Employee{
    private double salaryByHours; //Salario por hora
    private int hoursWorked; //Horas trabajadas

    @Override
    public double getSalary(){

        return this.getSalaryByHours()*this.getSalaryByHours();
    }

    public double getSalaryByHours() {
        return salaryByHours;
    }

    public void setSalaryByHours(double salaryByHours) {
        this.salaryByHours = salaryByHours;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
