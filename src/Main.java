import com.sun.jdi.Value;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<String, String> contactInfo = new HashMap<String, String>();

        contactInfo.put("mike@orange.com", "Michaelangelo");
        contactInfo.put("raph@red.com", "Raphael");
        contactInfo.put("leo@blue.com", "Leonardo");
       contactInfo.put("don@purple.com", "Donatello");

        System.out.println("contact : " + contactInfo.get("mike@orange.com"));
        System.out.println("contact : " + contactInfo.get("raph@red.com"));
        System.out.println("contact : " + contactInfo.get("leo@blue.com"));
        System.out.println("contact : " + contactInfo.get("don@purple.com"));


       contactInfo.remove("mike@orange.com");
        System.out.println(contactInfo);
    }
}