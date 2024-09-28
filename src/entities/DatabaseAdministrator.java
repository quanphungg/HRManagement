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

    public int getBonus() {
        return bonus;
    }

    @Override
    public int getSalary() {
        return this.salary + bonus;
    }

    @Override
    public String toString() {
        return "DatabaseAdministrator{" +
                "bonus=" + bonus +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", scanner=" + scanner +
                '}';
    }
}
