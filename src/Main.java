public class Main {

    public static void main(String[] args) {

        Weapon sword = new Weapon(WeaponType.SWORD, "BIGSWORD");

        Boss boss = new Boss("BOSS", 1000, 150, sword);

        boss.setHealth(1200);
        boss.setDamage(50);

        boss.printInfo();

        Weapon bow = new Weapon(WeaponType.BOW, "BOW");

        Skeleton skeleton1 = new Skeleton("Skeleton", 50, 100, bow, 20);
        Skeleton skeleton2 = new Skeleton("Skeleton", 70, 120, bow, 15);

        skeleton1.printInfo();
        skeleton2.printInfo();
    }
}