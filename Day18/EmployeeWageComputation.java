package com.oop;

import java.util.ArrayList;
import java.util.HashMap;

interface IEmployeeWageComputation
{
    public void addCompany(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs);

    public void calculateTotalWage();

    public int getTotalEmpWage(String companyName);
}

class CompanyEmpWage
{
    // instance constants
    final String companyName;
    final int wagePerHr;
    final int maxWorkingDays;
    final int maxWorkingHrs;
    // instance variable
    int totalEmpWage;

    //parameterized constructor to get and set the values
    CompanyEmpWage(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs)
    {
        this.companyName = companyName;
        this.wagePerHr = wagePerHr;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHrs = maxWorkingHrs;
        totalEmpWage = 0;
    }

    void setTotalEmployeeWage(int totalEmpWage)
    {
        this.totalEmpWage = totalEmpWage;
    }

    @Override
    public String toString() {
        System.out.println("Details of " + companyName + " employee");
        System.out.println("-----------------------------------------------------");
        System.err.println("Wage per hour:" + wagePerHr);
        System.out.println("Maximum working days:" + maxWorkingDays);
        System.out.println("Maximum working hours:" + maxWorkingHrs);
        return "Total wage for a month of " + companyName + " employee is " + totalEmpWage + "\n";
    }
}

class EmployeeWageComputation implements IEmployeeWageComputation
{
    // class constants
    public static final int partTime = 1;
    public static final int fullTime = 2;
    // instance variables

    //references of companyempwage objects are stored in arraylist
    ArrayList<CompanyEmpWage> companies;
    //companyname is mapped with total employee wage
    HashMap<String, Integer> totalEmpWages;

    //defalut constructor
    public EmployeeWageComputation()
    {
        companies = new ArrayList<>();
        totalEmpWages = new HashMap<>();
    }

    //it creats companyempwage objects and add to the arraylist
    public void addCompany(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs)
    {
        CompanyEmpWage company = new CompanyEmpWage(companyName, wagePerHr, maxWorkingDays, maxWorkingHrs);
        companies.add(company);
        totalEmpWages.put(companyName, 0);
    }

    int generateEmployeeType()
    {
        return (int) (Math.random() * 100) % 3;
    }

    int getWorkingHrs(int empType)
    {
        switch (empType)
        {
            case fullTime:
                return 8;
            case partTime:
                return 4;
            default:
                return 0;
        }
    }

    public void calculateTotalWage()
    {
        for (CompanyEmpWage company : companies)
        {
            int totalWage = calculateTotalWage(company);
            company.setTotalEmployeeWage(totalWage);
            System.out.println(company);
        }
    }

    int calculateTotalWage(CompanyEmpWage companyEmpWage)
    {
        System.out.println("Computation of total wage of " + companyEmpWage.companyName + " employee");
        System.out.println("-----------------------------------------------------");
        System.out.printf("%4s\t%4s\t%2s\t%4s\n", "Day", "Workinghrs", "Wage", "Total working hrs");

        int workingHrs, totalWage = 0;
        for (int day = 1, totalWorkingHrs = 0; day <= companyEmpWage.maxWorkingDays
                && totalWorkingHrs <= companyEmpWage.maxWorkingHrs; day++, totalWorkingHrs += workingHrs)
        {
            int empType = generateEmployeeType();
            workingHrs = getWorkingHrs(empType);
            int wage = workingHrs * companyEmpWage.wagePerHr;
            totalWage += wage;
            System.out.printf("%4d\t%5d\t%10d\t%10d\n", day, workingHrs, wage, totalWorkingHrs + workingHrs);
        }
        totalEmpWages.put(companyEmpWage.companyName, totalWage);
        return totalWage;
    }

    public int getTotalEmpWage(String companyName)
    {
        return totalEmpWages.get(companyName);
    }

    public static void main(String args[])
    {
        EmployeeWageComputation employeeWageComputation = new EmployeeWageComputation();
        employeeWageComputation.addCompany("Microsoft", 4, 30, 100);
        employeeWageComputation.addCompany("Google", 5, 40, 170);
        employeeWageComputation.addCompany("Amazon", 19, 10, 150);
        employeeWageComputation.calculateTotalWage();
        String query = "Google";
        int totalWage = employeeWageComputation.getTotalEmpWage(query);
        System.out.println("Total Employee Wage for " + query + " company is " + totalWage);
    }
}