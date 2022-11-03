package practica1;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("one", 1);
        mapa.put("two", 2);
        mapa.put("tree", 3);
        mapa.put("four", 4);

        System.out.println(mapa);

        for (Map.Entry<String, Integer> element : mapa.entrySet()) {
            System.out.println(element.getKey());
            System.out.println(element.getValue());
        }
    }
}
