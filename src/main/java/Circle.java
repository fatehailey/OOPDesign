class Circle extends Shape {

        int radius;
        int diameter;

        public Circle(int radius, int diameter) {
            this.radius = radius;
            this.diameter = diameter;
        }

        public void getRadius() {

        }

        public void getDiameter() {

        }

        public void getArea() {

        }

    @Override
    boolean getPerimeter() {
        return false;
    }

    public void getCircumference() {

        }

        public boolean isCircle() {
            return true;
        }

        @Override
        public String toString() {
            return "A circle with radius of" + radius + "which is a subclass of Circle";

        }
    }
}