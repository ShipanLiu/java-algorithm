package design_pattern_selflearn.t05_Dectorator_Pattern.shape_example;

/*
* step3: 创建实现了 Shape 接口的抽象装饰类。  下一步： 创建扩展了 ShapeDecorator 类的实体装饰类。
* */

/*
* 下面class 是 abstract 的原因：
* abstract because it is intended to serve as a base for other decorators, and it is not supposed to be instantiated directly.
* The main reasons for making it abstract are:
*Base for Other Decorators: It provides a common structure for other concrete decorators，
*    By making it abstract, we ensure that only the concrete decorators (which provide specific additional functionalities) can be instantiated.
*
* Prevent Direct Instantiation: Marking the class as abstract ensures that you cannot create an instance of ShapeDecorator directly.
*
* Placeholder for Additional Methods or Attributes: In the future, if you decide that all decorators should have a specific method or attribute, you can add it to this abstract class. Concrete decorators would then be required to provide an implementation for any abstract methods.
*
* 你加上abstract， 就防止了 直接的 实例化， 我们不希望 这个class 被实例化。
* 你加上 abstract， 假如以后 像添加方法的时候， 你就可以尽情添加 abstract 方法。 -----》 所有的child class 必须 implement 这个 abstract 方法
*
 * */

/*
* ShapeDecorator 也像 Circle 和  Rectangle 一样 implements Shape
*
* 不同点： 是 abstract class， 因此不用 实现 draw() 方法。 但是 我们还是 故意 overide draw 方法。
*
* */
public abstract class ShapeDecorator implements Shape{
    /*我想让我的 child class 也可以access 到 decoratedShape， 所以我用 protected*/
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }


    /*   */
    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
