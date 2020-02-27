package collections;

import java.util.*;

public class SynchronizedList {
    public static void main(String[] args) {
        List list = Collections.synchronizedList(new ArrayList<>());
        Set set = Collections.synchronizedSet(new HashSet<>());
        Map map = Collections.synchronizedMap(new HashMap<>());
    }
}
