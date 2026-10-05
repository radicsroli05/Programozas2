public class Rectangle {
    public double width;
    public double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public Rectangle(){
        this.width=1;
        this.height=1;
        //itt egy konstuktorba kell inicializálni
    }
    public double getPerimeter(){
        return 2*(this.width+this.width);
    }

    public double getArea(){
        return this.height*this.width;
    }
}
