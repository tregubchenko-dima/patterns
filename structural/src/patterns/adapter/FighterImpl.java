package patterns.adapter;

public class FighterImpl implements Fighter{
    @Override
    public void attack() {
        System.out.println("Attack");
    }

    @Override
    public void defend() {
        System.out.println("Defended");
    }

    @Override
    public void escape() {
        System.out.println("Escaped");
    }
}
