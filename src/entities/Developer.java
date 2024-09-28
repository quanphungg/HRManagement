package entities;

public class Developer extends Staff {

    private String programmingLanguage;

    public Developer(String name, int salary, String programmingLanguage) {
        super(name, salary);

        this.programmingLanguage = programmingLanguage;
    }

    public Developer() {
        super();
    }

    @Override
    public void input() {
        super.input();

        System.out.print("Programming Language: ");
        this.programmingLanguage = scanner.nextLine();
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "programmingLanguage='" + programmingLanguage + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
