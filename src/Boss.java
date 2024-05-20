public class Boss extends GameEntity {

    private Weapon weapon;

    public Boss(String entityName, int damage, int health, Weapon weapon) {
        super(entityName, damage, health);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void displayInfo() {
        super.info();
        System.out.println("Weapon: " + weapon);
    }

    public void printInfo() {
        System.out.println("Boss Information:");
        System.out.println("Name: " + getEntityName());
        System.out.println("Health: " + getHealth());
        System.out.println("Damage: " + getDamage());
        System.out.println("Weapon: " + weapon);
    }
}
