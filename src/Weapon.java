public enum Weapon {
    GUN(10),
    ROCKET(20),
    KNIFE(5);

    private int damage;

    Weapon(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
