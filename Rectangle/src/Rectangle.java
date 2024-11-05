public class Rectangle {
    private float length = 1.0f;
    private float width = 1.0f;

    public Rectangle(){

    }

    public Rectangle(float length, float width){
        this.width = width;
        this.length = length;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea(){
        return this.length * this.width;
    }

    public double getPerimeter(){
        return (this.length*2) + (this.width*2);
    }

    @Override
    public String toString() {
        return "Rectangle[length="+this.length+",width="+this.width+"]";
    }
}
