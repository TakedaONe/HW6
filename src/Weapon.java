public class Weapon {
    private WeaponType type;
    private String weaponType;

    public Weapon(WeaponType type, String weaponType) {
        this.type = type;
        this.weaponType = weaponType;
    }

    public WeaponType getType() {
        return type;
    }

    public void setType(WeaponType type) {
        this.type = type;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public String toString() {
        return "Weapon{" +
                "type='" + type + '\'' +
                ", name='" + weaponType + '\'' +
                '}';
    }
}
