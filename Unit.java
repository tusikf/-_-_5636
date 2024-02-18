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
    int x;
    int y;

    String className;
    Position position;

    public Unit(String name, int health, String weapon, int powerHit, int speed, int bronya, int atackRange, int hidding, Position position){
        this.className = this.getClass().getSimpleName();
        this.name = name;
        this.maxHealth = this.health = health;
        this.weapon = weapon;
        this.powerHit = powerHit;
        this.speed = speed;
        this.bronya = bronya;
        this.atackRange = atackRange;
        this.hidding = hidding;
        this.position = position;


    }



    // Метод вывода информации о персонаже
    protected void print() {
        System.out.println("Unit: " + className + ", Name: " + name + ", Health: " + health + ", Weapon: " + weapon + ", PowerHit: " + powerHit + ", Speed: " + speed + ", Bronya: " + bronya + ", AtackRange: " + atackRange + ", Hidding: " + hidding +"Position: " + position.getX() + "," + position.getY() + ".");
    }

    // Метод вывода короткой информации о персонаже
    protected void printShort() {
        System.out.println("Unit: " + className + ", Name: " + name +", Position: " + position.getX() + "," + position.getY() + ".");
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
