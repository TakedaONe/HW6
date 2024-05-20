public class Main {

    public static void main(String[] args) {

        Weapon sword = new Weapon(WeaponType.SWORD, "BIGSWORD");

        Boss boss = new Boss("BOSS", 1000, 150, sword);

        boss.setHealth(1200);
        boss.setDamage(50);

        boss.printInfo();
    }
}