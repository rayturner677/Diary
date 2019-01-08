import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Program {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Welcome to your journal\nUser: ");
        String user = reader.nextLine();
        Diary diary = new Diary(user.trim());

        System.out.println("Insert your Entry: ");
        post(reader, diary);
        reader.close();


    }


    public static void post(Scanner reader, Diary diary) {
        ArrayList<String> entries = new ArrayList<String>();
        while (true) {
            String line = reader.nextLine();
            entries.add(line);
            if (line.toLowerCase().equals("end")) {
                entries.remove(entries.size() - 1);
                diary.insertEntry(entries);
                break;
            }
        }

    }
}

