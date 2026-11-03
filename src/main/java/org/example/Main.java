package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        float salary = 50000;
        float hra = 10000;
        float da = 5000;
        float gross_salary;
        gross_salary = salary+hra+da;
        System.out.print("Gross Salary: ");
        System.out.print(gross_salary);
    }
}