package jcf;

public class ArrayList {
   
   public static void main (String[] args) {
       ArrayList <String> aList = new ArrayList<String>();

       aList.add(“cat”);
       aList.add(“dog”);
       aList.add(0,”bat”);

       aList.remove(“dog”);
       aList.remove(0);

       for (String s: aList)
       System.out.println(s);

       aList.set(1,”rat”);
       int p = aList.indexOf(“cat”);
       String s = aList.get(2);
       int items = aList.size();
       aList.contains(“cat”);
   }

}
