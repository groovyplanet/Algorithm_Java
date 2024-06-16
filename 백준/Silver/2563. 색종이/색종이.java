import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static abstract class Shape {
        abstract Area getArea();
    }

    static class Rectangle extends Shape {
        double x, y, width, height;

        Rectangle(double x, double y, double width, double height) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
        }

        Area getArea() {
            return new Area(new Rectangle2D.Double(x, y, width, height));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Shape> shapes = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            shapes.add(new Rectangle(x, y, 10, 10)); 
        }

 
        Area visible = new Area();

        for (int i = 0; i < N; i++) {
            Shape currentShape = shapes.get(i);
            Area currentArea = currentShape.getArea();


            visible.add(currentArea);
        }

        double visibleArea = calculateArea(visible);
        System.out.printf("%.0f\n", visibleArea);

        scanner.close();
    }

 
    private static double calculateArea(Area area) {
        double minX = 0, maxX = 100, minY = 0, maxY = 100;
        double step = 1.0;

        double areaSum = 0.0;
        for (double x = minX; x < maxX; x += step) {
            for (double y = minY; y < maxY; y += step) {
                if (area.contains(x, y)) {
                    areaSum += step * step;
                }
            }
        }
        return areaSum;
    }
}
