package entities;

public class Senior extends Developer {

    private int yearOfExperience;

    @Override
    public void input() {
        System.out.println("Year of experience");
        yearOfExperience = Integer.parseInt(scanner.nextLine());
    }

    @Override
    public void output() {
        System.out.println("Staff Info: ");
        System.out.println("Role: Senior");
        System.out.println("Name: " + name);
        System.out.println("Salary: " + this.getSalary());
        System.out.println("Experience: " + yearOfExperience);
    }

    public int getYearOfExperience() {
        return yearOfExperience;
    }

    @Override
    public int getSalary() {
        return (int) (salary * 1.5 * yearOfExperience);
    }
}
