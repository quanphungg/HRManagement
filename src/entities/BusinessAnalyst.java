package entities;

public class BusinessAnalyst extends Staff {

    private String domain;

    public String getDomain() {
        return domain;
    }

    @Override
    public void input() {
        super.input();

        System.out.print("Domain: ");
        domain = scanner.nextLine();
    }

    @Override
    public void output() {
        System.out.println("Staff Info: ");
        System.out.println("Role: BA");
        System.out.println("Name: " + name);
        System.out.println("Salary: " + this.getSalary());
        System.out.println("Domain: " + domain);
    }

    @Override
    public int getSalary() {
        double bonus = 0;

        if (domain.equalsIgnoreCase("healthcare")) {
            bonus = 0.25;
        } else if (domain.equalsIgnoreCase("assurance")) {
            bonus = 0.25;
        } else if (domain.equalsIgnoreCase("traffic")) {
            bonus = 0.3;
        }

        return (int) (salary + (bonus * salary));
    }
}
