import java.util.Scanner;

public class Program {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to your journal\nUser: ");
        String user = reader.nextLine();
        Dairy diary = new Dairy(user);

        System.out.println(diary.madeFile());
    }
}
