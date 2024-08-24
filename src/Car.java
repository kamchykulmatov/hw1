public class Car extends Transport{
    public Car(String mark) {
        super(mark);
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDE97");
    }
}
