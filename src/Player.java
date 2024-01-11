public class Player {
   private String name;
   private int healthPercentage;
   private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        this.healthPercentage = healthPercentage;
        this.weapon = weapon;
    }

    public void lookHealth(int healthPercentage){
        if (healthPercentage > 100){
            this.healthPercentage=100;
        } if (healthPercentage < 0){
            this.healthPercentage = 0;
        } else {
            this.healthPercentage = healthPercentage;
        }
    }

    public int healthRemainig(){
        return healthPercentage;
    }

    public void loseHealth(int damage) {
        healthPercentage-=damage;
        if (healthPercentage < 0){
            System.out.println(name + " player has been knocked out of game");
        }
    }

    public void restoreHealth(int healthPotion){
        healthPercentage+=healthPotion;
        lookHealth(healthPercentage);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", healthPercentage=" + healthPercentage +
                ", weapon=" + weapon +
                '}';
    }
}
