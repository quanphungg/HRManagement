package entities;

public class Senior extends Developer{

    private int yearOfExperience;

    public Senior() {
        super();
    }

    @Override
    public void input() {
        System.out.println("Year of experience");
        yearOfExperience = Integer.parseInt(scanner.nextLine());
    }

    public int getYearOfExperience() {
        return yearOfExperience;
    }

    @Override
    public int getSalary() {
        return (int) (salary * 1.5 * yearOfExperience);
    }

    @Override
    public String toString() {
        return "Senior{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
