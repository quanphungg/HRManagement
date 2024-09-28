package entities;

public class Fresher extends Developer {

    @Override
    public void output() {
        System.out.println("Staff Info: ");
        System.out.println("Role: Fresher");
        System.out.println("Name: " + name);
        System.out.println("Salary: " + this.getSalary());
    }
}
