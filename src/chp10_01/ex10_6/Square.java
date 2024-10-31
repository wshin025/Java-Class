package chp10_01.ex10_6;



public class Square extends shape {
    private int width;

    public int getWidth() {
        return width;
    }
    @Override
    double area() {
        //double result = width * width;
        double result = Math.pow(width,2);
        return result;
    }
    public void setWidth(int width) {
        this.width = width;
    }




}
