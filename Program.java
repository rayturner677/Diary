import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Program {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Welcome to your journal\nUser: ");
        String user = reader.nextLine();
        Dairy diary = new Dairy(user.trim());

        System.out.println("Insert your Entry: ");
        ArrayList<String> entries = new ArrayList<String>();

        while (true ){
           String line =  reader.nextLine();
           entries.add(line);
            if (line.equals("end")){
                entries.remove(entries.size()-1);
                diary.insertEntry(entries);
                break;
            }



        }
        reader.close();
//        Arrays.copyOfRange(entries, 0, entries.length - 2)




    }
}
