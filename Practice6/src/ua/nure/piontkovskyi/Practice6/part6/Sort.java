package ua.nure.piontkovskyi.Practice6.part6;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Map;

class Sort implements Comparator<String>, Serializable {

    private Map<String, Integer> map;

    public Sort(Map<String, Integer> map) {
        this.map = map;
    }

    @Override
    public int compare(String o1, String o2) {
        if (map.get(o1) >= map.get(o2)) {
            return -1;
        } else {
            return 1;
        }
    }

}