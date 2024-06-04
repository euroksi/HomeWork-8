public class Main {
        public static void main(String[] args) {
            Editor editor = new Editor();

            Shape shape = new Shape();
            Circle circle = new Circle();
            Quad quad = new Quad();
            Triangle triangle = new Triangle();
            Rectangle rectangle = new Rectangle();
            Square square = new Square();

            editor.displayShape(shape);
            editor.displayShape(circle);
            editor.displayShape(quad);
            editor.displayShape(triangle);
            editor.displayShape(rectangle);
            editor.displayShape(square);
        }
    }

