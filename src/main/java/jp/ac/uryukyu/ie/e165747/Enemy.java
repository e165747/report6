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
        if (getHitPoint() <= 0) {
            setDead();
            System.out.printf("モンスター%sは倒れた。\n", getName());
        }
    }
    public void attack(LivingThing opponent) {
        if (!isDead()) {
            int damage = (int) (Math.random() * getAttack());
            int cleanHitHero = (int) (Math.random() * 10);
            if (damage == 0) {
                System.out.printf("%sの攻撃！だが%sは攻撃を回避した！！\n", getName(), opponent.getName());
            } else if (cleanHitHero == 0 || cleanHitHero == 1) {
                damage *= 2;
                System.out.printf("%sの攻撃！痛恨の一撃！！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage);
            } else {
                System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage);
            }
            opponent.wounded(damage);
        }
    }
}

