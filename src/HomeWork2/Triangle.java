package HomeWork2;

public class Triangle extends Shape{
    private double a;
    private double b;
    private double c;


    Triangle(double a , double b , double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double getPerimeter(){
        return a+b+c;
    }
    double getA(){
        return a;
    }
    void setA(double a ){
        this.a = a;
    }
    double getB(){
        return b;
    }
    void setB(double b){
        this.b = b;
    }
    double getC (){
        return c;
    }
    void setC(double c){
        this.c = c;
    }
}



