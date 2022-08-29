package HomeWork2;

        public class Main {
            public static void main(String[] args) {
                Shape circle = new Сircle(5);
                Shape rectangle = new Rectangle(5,4);
                Shape ellipse = new Ellipse(5,4);
                Shape squar = new Squar(4);
                Shape triangle = new Triangle(5,4,3);
                System.out.println("\nCircle perimeter: "+circle.getPerimeter());
                System.out.println("\nRectangle perimeter: "+rectangle.getPerimeter());
                System.out.println("\nEllipse perimeter: "+ellipse.getPerimeter());
                System.out.println("\nSquar perimeter: "+squar.getPerimeter());
                System.out.println("\nTriangle perimeter: "+triangle.getPerimeter());
            }
        }

