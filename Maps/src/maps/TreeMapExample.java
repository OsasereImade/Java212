package maps;

/*
Java TreeMap example using strings and integers.
 */

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Iterator;

public class TreeMapExample {

    public static void main(String args[]) {

        TreeMap<String, Integer> treeMap = new TreeMap<>();
        /* Tip: Note the "<>". Java 7 can infer that it should be a TreeMap<String,String>
         * This will NOT work in Java 6 and below. Also, this is only for generic classes.
         * See also: http://docs.oracle.com/javase/tutorial/java/generics/genTypeInference.html
         */

        //Tell the map to associate the key with the element using put.
        //See also: http://docs.oracle.com/javase/7/docs/api/java/util/Map.html#put%28K,%20V%29
        /* Tip: Here, we take advantage of autoboxing, which automatically converts int to Integer.
         * Otherwise, we would have to write
         *     treeMap.put("One", new Integer(1));
         * See also: http://www.leepoint.net/notes-java/data/basic_types/autoboxing.html
         */
        treeMap.put("One", 1);
        treeMap.put("Two", 2);
        treeMap.put("Three", 3);

        //Let's see everything in the dictionary
        /* Tip: Set, Iterator, and MapEntry in more complex programs may be
                Set<Map.Entry<String, String>>
                Iterator<Map.Entry<String, String>>
                Map.Entry<String,String>
            to be sure that your set of map entries isn't really a set of Cats
         */
      /* Warning: Maps don't have iterators, so we have to get a Set version
       * so we can ask for its iterator.
       */
        Set set = treeMap.entrySet();
        Iterator i = set.iterator();
        while (i.hasNext()) {
            /* Every element of the map is a key/value pair, and we have to extract that 
             * See also: http://docs.oracle.com/javase/7/docs/api/java/util/Map.Entry.html
             */
            Map.Entry me = (Map.Entry)i.next();
                    //must cast because i.next() returns Object, not Map.Entry
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

    }
}
