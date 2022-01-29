import weapons.*;

public class Player {
    private Weapon[] weaponSlots;

    public Player() {
        weaponSlots = new Weapon[] {
            new Gun(), new Rifle(), new Rpg(), new Slingshot(), new WaterPistol()
        };
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {

        if (slot > getSlotsCount() - 1 || slot < 0) {
            System.out.println("The entered slot is incorrect");
            return;
        }

        Weapon weapon = weaponSlots[slot];
        weapon.shot();
    }
}
