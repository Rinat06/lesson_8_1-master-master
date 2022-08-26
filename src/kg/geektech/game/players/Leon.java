package kg.geektech.game.players;

public class Leon extends Hero{
    public Leon(int health, int damage, String name) {
        super(health, damage, name,SuperAbility.BOOST);
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        if(boss.getHealth()>0){
            this.setHealth(0);
            System.out.println("погиб сразу");
        }

    }
}
