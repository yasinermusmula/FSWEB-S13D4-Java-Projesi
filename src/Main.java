public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Point first = new Point(6,5);
        Point second = new Point(3,1);

        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));

        System.out.println("distance(2,2)= " + first.distance(2,2));

        Point point = new Point(0,0);

        System.out.println("distance()= " + point.distance());

        System.out.println("***********************");
        Player thor = new Player("Thor",75,Weapon.GUN);

        System.out.println(thor);
        thor.loseHealth(Weapon.GUN.getDamage());
        System.out.println(thor.healthRemainig());
        thor.restoreHealth(20);
        System.out.println(thor.healthRemainig());
    }
}