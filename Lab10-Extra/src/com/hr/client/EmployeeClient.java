package com.hr.client;

import com.hr.Employee;
import com.hr.WorkException;

public class EmployeeClient {

    public static void main(String[] args) {
        Employee emp = new Employee("Jay");

        try {
            emp.goToWork();
        }
        catch (WorkException e) {
            System.out.println(e.getMessage());  // just the reason string
            System.out.println(e.getCause());    // extract the nested 'cause'
            e.printStackTrace();
        }
    }
}