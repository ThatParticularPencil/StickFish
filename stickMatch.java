public class stickMatch {
    public static void main(String[] args) {
        welcome();
        tests();
        
    } 

    public static void tests() {
        humanPlayer testPlayer1 = new humanPlayer("Player1");
        humanPlayer testPlayer2 = new humanPlayer("Player2");

        System.out.println(testPlayer1);
        System.out.println(testPlayer2);

        testPlayer1.attack(testPlayer1.hands[0], testPlayer2.hands[0]);

        System.out.println(testPlayer1);
        System.out.println(testPlayer2);

    }

    public static void welcome() {
        System.out.println("\n\n");
    }
}


