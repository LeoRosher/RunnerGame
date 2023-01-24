package game.runnergame.Model;

public class Entity extends GameObject{
    private int HP;

    public Entity(String name, String image, int posX, int posY, int HP) {
        super(name, image, posX, posY);
        this.HP = HP;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }
}
