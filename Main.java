import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Player player = new Player();

        System.out.format("The player has %d slots of weapon, " +
                "insert the number to shoot, " +
                "-1 to escape%n",
                player.getSlotsCount()
        );
        int slot = 0;

        //todo insert num until -1 is inserted
        while (slot != -1) {
            slot = scan.nextInt();
            player.shotWithWeapon(slot);
        }

        System.out.println("Game over!");
    }
}