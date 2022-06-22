package CommonMethods;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Common {

    public static String getCurrentData() {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String refDate = date.format(formatter);
        String substringDay = refDate.substring(refDate.indexOf("/") + 1, refDate.lastIndexOf("/"));
        int day = Integer.parseInt(substringDay) + 2;
        refDate = refDate.replaceFirst(substringDay, String.valueOf(day));
        return refDate;
    }
}
