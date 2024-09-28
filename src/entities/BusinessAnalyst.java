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

    @Override
    public String toString() {
        return "BusinessAnalyst{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + getSalary() +
                ", domain='" + domain + '\'' +
                '}';
    }
}
