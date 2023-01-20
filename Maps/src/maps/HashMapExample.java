package maps;

import java.util.HashMap;
import java.util.Iterator;
 
public class HashMapExample{
       public static void main(String args[]){
          HashMap hashMap = new HashMap();
          hashMap.put("One", new Integer(1)); 
          hashMap.put("Two", new Integer(2));
          hashMap.put("Three", new Integer(3));

        Integer myInt = (Integer) hashMap.get("Two");
      
        if(hashMap.containsValue(new Integer(1)))
            System.out.println("HashMap contains 1 as value");
         else
            System.out.println("HashMap does not contain 1 as value");
       
        if( hashMap.containsKey("One") )
            System.out.println("HashMap contains One as key");
        else
            System.out.println("HashMap does not contain One as value");
       } 

}
