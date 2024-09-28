package entities;

import java.util.Scanner;
import java.util.UUID;

public class Staff {

    protected String id;
    protected String name;
    protected int salary;
    protected Scanner scanner;

    public Staff() {
        this.id = UUID.randomUUID().toString();
        this.scanner = new Scanner(System.in);
    }

    public Staff(String name, int salary) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.salary = salary;
        this.scanner = new Scanner(System.in);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void input() {

        System.out.print("Name: ");
        this.name = scanner.nextLine();

        System.out.print("Salary: ");
        this.salary = Integer.parseInt(scanner.nextLine());
    }

    public void output() {
        System.out.println();
        System.out.println(this.toString());
        System.out.println();
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
