package jp.ac.uryukyu.ie.e165747;

/**
 * Created by e165747 on 2016/12/17.
 */
public class Enemy extends LivingThing {
    Enemy (String name, int maximumHP, int attack) {
        super(name,maximumHP,attack);
    }

    public void wounded(int damage) {
        setHitPoint(getHitPoint() - damage);
        if (getHitPoint() < 0) {
            setDead();
            System.out.printf("モンスター%sは倒れた。\n", getName());
        }
    }
}
