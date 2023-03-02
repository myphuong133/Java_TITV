package Java65_cau_truc_Map;

import java.util.*;

public class Map_demo {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // Creating an empty Map
        Map<String, String> map = new HashMap<String, String>();

        // Mapping int values to string keys
        map.put("Geeks", "10");
        map.put("4", "15");
        map.put("Geeks", "20");
        map.put("Welcomes", "25");
        map.put("You", "30");

        System.out.println("Nhập vào từ tiếng anh: ");
        String english = sc.nextLine();
        System.out.println("Nhập vào nghĩa: ");
        String vietNam = sc.nextLine();
        map.put(english,vietNam);
        // Displaying the Map
        System.out.println("Initial Mappings are: " + map);

        // Getting the value of "Geeks"
        System.out.println("The Value is: " + map.get("Geeks"));
        System.out.println("The Value is: " + map.get(vietNam));

        // Getting the value of "You"
        System.out.println("The Value is: " + map.get("You"));
    }
}
