// This program is awesome and this comment will be ignored!
public class Dork {
    public static void main(String[] args) {
        // Display a welcome message
        var welcomeMessage = "Welcome to Dork!   An amazing adventure full of sporks and florks and orks (and of course, dorks!)";
        System.out.println(welcomeMessage);

        var thePlayer = new Player();
        thePlayer.attackPower = getRandomNumber(20, 100);
        thePlayer.health = 100;
        thePlayer.name = "Riley the Conquerer";

        var aMonster = new Monster();
        aMonster.attackPower = getMonsterAttackPower();
        aMonster.health = getRandomNumber(50, 70);
        aMonster.name = "Sporkmonster";
        aMonster.type = "Spork";

        var playerDied = fightPlayerAndMonster(thePlayer, aMonster);
        System.out.printf("Player died: %s\n", (playerDied ? "Yes" : "No"));
    }

    static int getMonsterAttackPower() {
        return getRandomNumber(0, 100);
    }

    // This method returns a random number between 'min' and 'max'.
    static public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    // returns whether or not the player died.
    static boolean fightPlayerAndMonster(Player somePlayer, Monster someMonster) {
        while (true) {
            // Player attacks first!
            if (somePlayer.attackPower >= someMonster.health) {
                // Monster is dead
                return false;
            }
            else {
                someMonster.health = someMonster.health - somePlayer.attackPower;
            }

            // Monster attacks!
            if (someMonster.attackPower >= somePlayer.health) {
                // Player is dead!
                return true;
            }
            else {
                somePlayer.health = somePlayer.health - someMonster.attackPower;
            }
        }
    }
}
