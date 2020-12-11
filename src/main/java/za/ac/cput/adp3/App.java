package za.ac.cput.adp3;

import java.util.*;


public class App 
{
    public static void main( String[] args )
    {
        Map<Integer, String> map = new HashMap();
        map.put(1, "Avery");
        map.put(2, "Daniels");
        map.put(3, "Junior");

        System.out.println("\nPrinting the Map:");
        System.out.println(map);

        Set<Integer> mapKey;
        mapKey = map.keySet();

        List<String> valList = new ArrayList();
        Collection<String> valCollect = Collections.unmodifiableCollection(map.values());
        valList.addAll(valCollect);

        // PRINTING
        System.out.println("\nSet:");
        System.out.println(mapKey);
        System.out.println("\nList:");
        System.out.println(valList);
    }
}
