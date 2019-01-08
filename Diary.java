import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;



public class Diary {
    static String user;
    private static String pathname;

    public Diary(String user){
        this.user = user;
        this.pathname = "./src/" + this.user + ".txt";
    }


    public boolean madeFile(){
        try {
            File f = new File(pathname);
            if (!f.exists()){
                f.createNewFile();
                return true;
            }else{
                return false;
            }
        }
        catch(Exception e){
            return false;
        }
    }

    public void insertEntry(ArrayList<String> entries){

        try {
            String date = gettingDate();

            String entry = String.join("\n", entries);
            String entryFormatted = "\n" + date + "\n"+ entry + "\n";
            BufferedWriter writer = new BufferedWriter(new FileWriter(pathname, true));
            writer.append(entryFormatted);
            writer.close();
        }
        catch (Exception e){

        }

    }

    public static String gettingDate() {
        Date date = new Date();
        String strDateFormat = "hh:mm:ss a";
        DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
        String formattedDate = dateFormat.format(date);
        return formattedDate;

    }
}
