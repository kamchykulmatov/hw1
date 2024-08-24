public class Bus extends Transport{
    public Bus(String mark) {
        super(mark);
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDE8C");
    }
}
