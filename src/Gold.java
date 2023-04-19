public class Gold extends Item{

    private int amount;

    public Gold (String name, int amount)
    {
        super ("Biscuit Gold", String.format("It's shape like rectangle with a number in the middle.", String.valueOf(amount)),amount);
        this.amount = amount;
    }
}
