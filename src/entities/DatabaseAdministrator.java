package entities;

import java.util.Scanner;

// Staff la super class
// DBA la sub-class, tat ca cac member cua lop Staff cung la cua lop DBA ngoai tru
// constructor
public class DatabaseAdministrator extends Developer {

    private int bonus;

    @Override
    public void input() {
        super.input();

        System.out.print("Enter bonus: ");
        this.bonus = this.scanner.nextInt();
    }

    @Override
    public void output() {
        System.out.println("Staff Info: ");
        System.out.println("Role: DBA");
        System.out.println("Name: " + name);
        System.out.println("Salary: " + this.getSalary());
        System.out.println("Bonus: " + bonus);
    }

    public int getBonus() {
        return bonus;
    }

    @Override
    public int getSalary() {
        return this.salary + bonus;
    }
}
