public class Enemy {

    protected String enemyName;
    protected int healthPoints;
    protected int healthDamage;

    public Enemy (String enemyName, int healthPoints,  int healthDamage)

    {
        this.enemyName = enemyName;
        this.healthPoints = healthPoints;
        this.healthDamage = healthDamage;
    }
    public boolean is_alive ()
    {
        return (this.healthPoints>0);
    }
    public String toString()
    {
        return String.format("%s \n-------------------\nhealthPoints: %s \nhealthDamage: %d \n", this.enemyName, this.healthPoints, this.healthDamage);
    }
}
