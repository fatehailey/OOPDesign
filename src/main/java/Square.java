class Square extends Rectangle {

    public Square(int length, int width) {
        super(length, width);
    }

        @Override
        public void getArea () {

    }

        @Override
        public boolean getPerimeter() {
        return false;
    }

        public void getDiagonal () {

    }
        @Override
        public String toString() {
        return "A rectangle with" + width + "and" + length + "which is a subclass of" + super.toString();

    }
}




