package lecture4;

public class Fighter {
    private int hitPoint;
    private int power;
    private String name;

    public Fighter(int hitPoint,int power,String name){
        this.hitPoint = hitPoint;
        this.power = power;
        this.name = name;
    }
    public void attack(Fighter enemy){
        int h = enemy.getHitPoint();
        h = h - this.power;
        enemy.setHitPoint(h);
        System.out.println(this.name + "は" + enemy.name  + "に" + power + "ダメージを与えた。");
        System.out.println(enemy.name + "の残りHPは" + enemy.hitPoint);
    }
    public boolean isAlive(){
        if(this.hitPoint <= 0){
            return false;
        }
        return true;
    }
    public int getHitPoint(){
        return this.hitPoint;
    }

    public void setHitPoint(int hitPoint){
        this.hitPoint = hitPoint;
    }
    public String getName(){
        return this.name;
    }
}
