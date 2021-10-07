package io.pera.c12;

import io.pera.c12.association.Bank;
import io.pera.c12.association.Employee;

public class Task {

    // Association Example
    public static void main(String[] args) {
        Bank bank = new Bank("Axis");
        Employee emp = new Employee("Neha");
        System.out.println(emp.getEmployeeName() + " is employee of " + bank.getBankName());
    }

}


// OUTPUT
/*

Neha is employee of Axis

 */

