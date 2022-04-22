class Rectangle extends Shape{

    int length;
    int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    public void getLength(){

    }
    public void getWidth(){

    }
    public void getArea(){

    }
    public boolean getPerimeter(){

        return false;
    }
    public void getDiagonal(){

    }
    public boolean isRectangle(){
        return true;
    }

    @Override
    public String toString(){
        return "A rectangle with" +width+ "and" +length+ "which is a subclass of" +super.toString();

    }
}
