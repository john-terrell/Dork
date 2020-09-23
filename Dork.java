// This program is awesome and this comment will be ignored!
public class Dork {
    public static void main(String[] args) {
        // Display a welcome message
        var welcomeMessage = "Welcome to Dork!   An amazing adventure full of sporks and florks and orks (and of course, dorks!)";
        System.out.println(welcomeMessage);

        var playerHealth = 100;

        // This is the main game loop
        var isPlayerAlive = true;
        while (isPlayerAlive == true) {
            var currentMonsterAttackPower = getMonsterAttackPower();

            System.out.printf("Monster attacked for %d - ", currentMonsterAttackPower);
            playerHealth = playerHealth - currentMonsterAttackPower;
            if (playerHealth <= 0) {
                System.out.println("Player is dead.  Too bad.");
                isPlayerAlive = false;
            }
            else {
                System.out.printf("Player is still alive with health: %d\n", playerHealth);
            }
        }
    }

    static int getMonsterAttackPower() {
        return getRandomNumber(0, 100);
    }

    // This method returns a random number between 'min' and 'max'.
    static public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
