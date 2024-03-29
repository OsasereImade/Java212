package classppt;

public class TowersOfHanoi {

   public static void main(String[] args) {
      moveRings(3,"A","B","C");

   }
   private static void moveRings(int numberOfRings, String fromTower,
                                 String toTower, String tempTower) {
      if (numberOfRings == 0) return;
      moveRings (numberOfRings-1, fromTower, tempTower, toTower);
      System.out.println("Move a ring from tower "+fromTower+" to tower "+
                           toTower);
      moveRings (numberOfRings-1, tempTower, toTower, fromTower);
   }
}
