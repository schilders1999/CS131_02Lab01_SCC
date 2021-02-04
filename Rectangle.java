public class Rectangle{
    private int length;
    private int width;

    public Rectangle(){
        length = 1;
        width = 1;
    }
    
    public Rectangle(int length, int width){
        this.length=length;
        this.width=width;
    }
    
        public int calculateArea(){
        return length*width;
    }
    
    public int calculatePerimeter(){
        return (2*length) + (2*width);
    }
    
    public int getLength(){
        return length;
    }
    
    public int getWidth(){
        return width;
    }

}