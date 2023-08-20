package design_pattern_selflearn.t05_Dectorator_Pattern.shape_example;

/*
* 继承一个 abstract class：
* When you extend an abstract class in Java, you create a subclass of that abstract class.
* If the abstract class contains any abstract methods (methods without a body),
* then the subclass must provide concrete implementations for all of those abstract methods,
* unless the subclass is also declared as abstract.
*
* */

public class RedShapeDecorator extends ShapeDecorator{

    /*每一个 class 都有一个 constructor */
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }


//    故意 override father 的 draw 方法
    @Override
    public void draw() {
//        你也可以直接用 decoratedShape.draw()
        super.decoratedShape.draw();
//        开始 给 加东西了
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape shape) {
        System.out.println("Border Color: red");
    }
}
