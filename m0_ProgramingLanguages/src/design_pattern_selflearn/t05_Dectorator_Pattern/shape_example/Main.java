package design_pattern_selflearn.t05_Dectorator_Pattern.shape_example;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();

        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("Circle with red border");
        redCircle.draw();

        System.out.println("Rectangle with red border");
        redRectangle.draw();
    }
}
