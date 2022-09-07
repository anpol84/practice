package practice3;

public class TestMovable {
    public static void main(String[] args){
        MovablePoint point1 = new MovablePoint(2, 1, 50, 50);
        System.out.println(point1);
        point1.moveDown();
        point1.moveRight();
        System.out.println(point1);
        point1.moveLeft();
        point1.moveUp();
        System.out.println(point1);

        MovableCircle circle1 = new MovableCircle(2, 1, 50, 50, 10);
        System.out.println(circle1);
        circle1.moveRight();
        circle1.moveDown();
        System.out.println(circle1);
        circle1.moveLeft();
        circle1.moveUp();
        System.out.println(circle1);

        MovableRectangle rectangle1 = new MovableRectangle(2, 1, 5, 3, 30, 30);
        System.out.println(rectangle1);
        rectangle1.moveDown();
        rectangle1.moveRight();
        System.out.println(rectangle1);
        rectangle1.moveLeft();
        rectangle1.moveUp();
        System.out.println(rectangle1);
        MovableRectangle rectangle2 = new MovableRectangle(5, 5, 10, 10, 15, 10);
        rectangle2.moveUp();
        rectangle2.moveRight();
        System.out.println(rectangle2);
    }
}
