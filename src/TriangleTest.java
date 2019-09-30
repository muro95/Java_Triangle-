public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle);
        triangle.setSide1(2);
        triangle.setSide2(2);
        triangle.setSide3(2);
        triangle.setColor("Red");
        System.out.println(triangle+ "\n");

        triangle = new Triangle(3,3,3,"Yellow",true);
        System.out.println(triangle);
        triangle.setSide1(4);
        triangle.setSide2(4);
        triangle.setSide3(4);
        triangle.setColor("Blue");
        System.out.print(triangle);
    }
}
