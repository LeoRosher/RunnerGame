package game.runnergame.Model;

public class Entity extends GameObject{
    protected int HP;
    protected int velocity;

    public Entity(String name, String image, int posX, int posY, int HP, int velocity) {
        super(name, image, posX, posY);
        this.HP = HP;
        this.velocity = velocity;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }
}
