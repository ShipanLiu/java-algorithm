package design_pattern_selflearn.t05_Dectorator_Pattern.shape_example;

/*
 * step 2:创建实现接口的实体类   下一步 创建实现了 Shape 接口的抽象装饰类： ShapeDecorator
 *
 * */


public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}


