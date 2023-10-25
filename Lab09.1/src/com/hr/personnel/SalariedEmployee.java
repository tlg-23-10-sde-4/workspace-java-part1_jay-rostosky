package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    public static final double STANDARD_DEDUCTION = 10_000.0;

    private double salary;

    // constructors
    public SalariedEmployee() {
        super();
    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
        // registerIn40k()
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        this(name, hireDate);
        setSalary(salary);
    }

    // business ("action") methods
    @Override
    public void pay() {
        double payment = getSalary();
        System.out.println(getName() + " is paid salary " + payment);
    }

    @Override  // interface TaxPayer (required)
    public void payTaxes() {
        double taxes = getSalary() * SALARIED_TAX_RATE;
        System.out.printf("%s paid taxes of %s\n", getName(), taxes);
    }

    @Override  // interface TaxPayer (opt-in)
    public double getStandardDeduction() {
        return STANDARD_DEDUCTION;
    }

    public void takeVacation() {
        System.out.println(getName() + " is on vacation");
    }

    // accessor methods
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", salary=" + getSalary();
    }
}