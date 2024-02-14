abstract class Unit {
    String name;
    int health;
    String weapon;
    int powerHit;
    int speed;
    int bronya;
    int atackRange;
    int hidding;
    int maxHealth;

    public Unit(String name, int health, String weapon, int powerHit, int speed, int bronya, int atackRange, int hidding){
        this.name = name;
        this.maxHealth = this.health = health;
        this.weapon = weapon;
        this.powerHit = powerHit;
        this.speed = speed;
        this.bronya = bronya;
        this.atackRange = atackRange;
        this.hidding = hidding;
    }

    // Метод вывода информации о персонаже
    protected void print() {
        System.out.println("Name: " + name + ", Health: " + health + ", Weapon: " + weapon + ", PowerHit: " + powerHit + ", Speed: " + speed + ", Bronya: " + bronya + ", AtackRange: " + atackRange + ", Hidding: " + hidding + ".");
    }

    // Метод нанесения урона
    public void Atack(Unit unit1, Unit unit2) {
        unit2.health = unit2.health - unit1.powerHit;

    }

    // Метод лечения
    public void Heall(Monk monk, Unit unit1) {
        unit1.health = unit1.health + monk.healing;

    }

    // Метод получения урона
    public void Damag(Unit unit1, Unit unit2) {
        unit1.health = unit1.health - unit2.powerHit;

    }

    // Метод колдовства
    public void Magical(Mag mag, Unit unit1) {
        unit1.health = unit1.health - mag.mana;

    }

}
