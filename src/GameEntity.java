public abstract class GameEntity {

    private String entityName;
    private int damage;
    private int health;

    public GameEntity(String entityName, int damage, int health) {
        this.entityName = entityName;
        this.damage = damage;
        this.health = health;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void info(){
        System.out.println("\nName = " + entityName);
        System.out.println("\nHealth = " + health);
        System.out.println("\nDamage = " + damage);
    }

    public abstract void displayInfo();
}
