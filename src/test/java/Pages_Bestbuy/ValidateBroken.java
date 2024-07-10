package Pages_Bestbuy;

import java.net.HttpURLConnection;
import java.net.URL;

public class ValidateBroken {
    public static boolean isLinkBroken(String linkUrl) {
        try{
            URL url = new URL(linkUrl);
            HttpURLConnection connection = (HttpURLConnection)  url.openConnection();
            connection.connect();
            if (connection.getResponseCode() >=400) {
                return true;
            }
        } catch (Exception e) {
            return true;

        }
            return false;


    }
}
