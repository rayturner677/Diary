import java.io.File;

public class Dairy {
    static String user;
    private static String pathname;

    public Dairy(String user){
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
}
