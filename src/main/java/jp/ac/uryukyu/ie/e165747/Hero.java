package jp.ac.uryukyu.ie.e165747;

/**
 * Created by e165747 on 2016/12/17.
 */
public class Hero extends LivingThing{
    Hero(String name, int maximumHP, int attack){
        super(name,maximumHP,attack);
    }

    public void wounded(int damage) {
        setHitPoint(getHitPoint() - damage);
        if (getHitPoint() < 0) {
            setDead();
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", getName());
        }
    }

    public void attack(LivingThing opponent){
        if(isDead() == false){
            int damage = (int) (Math.random() * getAttack());
            int cleanHitHero = (int) (Math.random() * 10);
            if(damage == 0) {
                System.out.printf("%sの攻撃！だが%sは攻撃を回避した！！\n", getName(), opponent.getName());
            }else if(cleanHitHero == 0||cleanHitHero == 1||cleanHitHero ==2){
                damage *= 2;
                System.out.printf("%sの攻撃！会心の一撃！！%sに%dのダメージを与えた！！\n",getName(),opponent.getName(),damage);
            }else{
                System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage);
            }
            opponent.wounded(damage);
        }
    }
}
