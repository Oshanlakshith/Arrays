import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        LinkedList<String> list2 = new LinkedList<String>();
        HashMap<String, String> map = new HashMap<String, String>();

        map.put("Colombo", "colombo");
        System.out.println(map);
        map.remove("Colombo");
        System.out.println(map);


        list.add("arrayList");
        System.out.println(list);
        list.remove("arrayList");
        System.out.println(list);

        list2.add("hello");
        list2.add("hell");
        System.out.println(list2);
        list2.remove("hello");
        System.out.println(list2);

    }
}
