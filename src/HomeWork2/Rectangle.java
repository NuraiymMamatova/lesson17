package HomeWork2;


public class Rectangle extends Shape{
    private double a ;
    private double b ;

    Rectangle (double a , double b){
        this.a = a;
        this.b = b;
    }
    @Override
    public double getPerimeter(){
        return 2*(a+b);
    }
    double getA (){
        return a;
    }
    void setA(double a){
        this.a = a ;
    }
    double getB (){
        return b;
    }
    void setB(double b){
        this.b = b;
    }
}
