package jp.ac.uryukyu.ie.e165747;

/**
 * Created by e165747 on 2016/12/17.
 */
public class Hero extends LivingThing{ Hero(String name, int maximumHP, int attack){
    super(name,maximumHP,attack);
}

    public void wounded(int damage) {
        setHitPoint(getHitPoint() - damage);
        if (getHitPoint() < 0) {
            setDead();
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", getName());
        }
    }

}
