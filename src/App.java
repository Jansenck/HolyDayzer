import java.util.HashMap;
import Classes.Holydays;

public class App {

    public static void main(String[] args) throws Exception {
        Holydays holydays = new Holydays();

        String date = "01/01/2023";
        System.out.println("Hollyday " + date + ": " + holydays.getHolyday(date));

        date = "30/06/2023";
        System.out.println("Hollyday " + date + ": " + holydays.getHolyday(date));

        HashMap<String, String> holydaysArray = holydays.getHolyday();
        for (String day : holydaysArray.keySet()) {
            System.out.println(day + ": " + holydaysArray.get(day));
        }
    }
}


