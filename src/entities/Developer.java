package entities;

public abstract class Developer extends Staff {

    private String programmingLanguage;

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
}
