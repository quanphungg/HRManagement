import entities.BusinessAnalyst;
import entities.Fresher;
import entities.Senior;
import entities.Staff;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mode;
        Staff staff = null;
        Scanner scanner = new Scanner(System.in);
        do {
            printMenus();
            System.out.print("Choose a mode: ");
            mode = scanner.nextInt();

            switch (mode) {
                case 1:
                    staff = new Fresher();
                    staff.input();
                    break;
                case 2:
                    staff = new BusinessAnalyst();
                    staff.input();
                    break;
                case 4:
                    staff = new Senior();
                    staff.input();
                case 6:
                    if (staff != null) staff.output();
                    break;
                case 7:
                    System.out.println("Bye bye!");
                    break;
                default:
                    System.out.println("Please choose a valid mode!");
                    break;
            }
        } while (mode != 7);
    }

    public static void printMenus() {
        System.out.println("1) Fresher");
        System.out.println("2) Business Analyst");
        System.out.println("3) Database Administrator");
        System.out.println("4) Senior");
        System.out.println("6) Show info");
        System.out.println("7) Exit");
    }
}