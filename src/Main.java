//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Circle circle =new Circle("Круг", 10);
        Triangle triangle = new Triangle("Треугольник",
                4, 6,4);
        Square square = new Square("Квадрат", 5);
        Rectangle rectangle = new Rectangle(
                "Прямоугольник", 5, 9);

        Car car = new Car("Мерседес");
        Bus bus = new Bus("Автобус (China)");

        //полиморфизм
        Drawable[] drawables = {circle, triangle, square, rectangle, car, bus};

        for (int i = 0; i < drawables.length; i++) {
            if (drawables[i] instanceof Figure){
                System.out.println( ((Figure) drawables[i]).getName() +
                        " Периметр -> " + ((Figure)drawables[i]).calculatePerimeter());
            }
            if (drawables[i] instanceof Transport){
                System.out.println(((Transport) drawables[i]).getMark());
            }
            if(drawables[i] instanceof Circle){
                ((Circle) drawables[i]).circleRotation();
            }
            drawables[i].draw();
        }
    }
}