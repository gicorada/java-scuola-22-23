public class PurseTester {
    public static void main(String[] args) {
        Purse borsellino = new Purse(50);
        
        Purse altroBorsellino = new Purse(50);
        
        borsellino.addCoin("Test1");
        borsellino.addCoin("Test1");
        borsellino.addCoin("Test1");
        borsellino.addCoin("Test");
        altroBorsellino.addCoin("Test");
        altroBorsellino.addCoin("Test1");
        altroBorsellino.addCoin("Test1");
        altroBorsellino.addCoin("Test1");
        
        System.out.println(borsellino.sameCoins(altroBorsellino));
        
        System.out.println(borsellino.toString());
        System.out.println(altroBorsellino.toString());
    }
}