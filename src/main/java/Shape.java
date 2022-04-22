public abstract class Shape {
    private String color;
    private boolean filled;

    public Shape() {
        color = "green";
        filled = true;
    }

    private Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
   }
    abstract void getArea();
    abstract boolean getPerimeter();

    public String getColor(){
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public String toString(){
        return "A Shape with color of " +color +"and" +filled;

    }
}

