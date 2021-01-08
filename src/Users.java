import java.util.Arrays;
import java.util.HashMap;

public class Users {
    String a[];
    HashMap<String, String> user = new HashMap<String, String>();
    public Users() {
        Arrays.fill(a, -1);
    }

    public void put(String key, String value) {
        a[Integer.parseInt(key)] = value;
    }
    public String get(String key) {
        return a[Integer.parseInt(key)];
    }

    public void remove(String key) {
        remove(key);
    }

}
