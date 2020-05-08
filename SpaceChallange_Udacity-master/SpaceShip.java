public interface SpaceShip {
   
    boolean launch();

   
    boolean land();

   
    boolean canCarry(Item specifiedItem);

   
    void carry(Item specifiedItem);
}
