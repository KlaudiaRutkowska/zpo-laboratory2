package exercise1;

import java.util.ArrayList;
import java.util.Random;

public class MainRPG {
    static Random rand;

    public static void main(String[] args) {
        ArrayList<Character> characters = new ArrayList<>();
        ArrayList<Weapon> weapons = new ArrayList<>();

        characters.add(new Archer(new Bow()));
        characters.add(new Knight(new Sword()));
        characters.add(new Gunner(new Minigun()));
        characters.add(new Shooter(new Pistol()));

        weapons.add(new Pistol());
        weapons.add(new Minigun());
        weapons.add(new Sword());
        weapons.add(new Bow());
        weapons.add(new Crossbow());
        weapons.add(new Dagger());
        weapons.add(new RocketLauncher());
        weapons.add(new Rifle());

        for (Character character : characters) {
            character.attack();
            System.out.println("Changing weapon!");
            Weapon newWeapon = getRandomWeapon(weapons);
            character.setWeapon(newWeapon);
            System.out.println("Changed weapon");
            character.attack();
            System.out.println("---");
        }
    }

    public static Weapon getRandomWeapon(ArrayList<Weapon> weapons) {
        rand = new Random();

        return weapons.get(rand.nextInt(weapons.size()));
    }
}
