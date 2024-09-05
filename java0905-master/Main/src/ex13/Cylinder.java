package ex13;

public class Cylinder {
    int radius;
    int height;


    double getVolume() {
        return Math.PI * Math.pow(radius, 2)* height;
    }
    double getSurfaceArea() {
double circleArea = Math.PI * Math.pow(radius, 2);
double rectangleArea =2 * Math.PI * radius * height;

return 2 * circleArea + rectangleArea;
    }

}
// 제발 푸시