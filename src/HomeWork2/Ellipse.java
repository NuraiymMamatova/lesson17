package HomeWork2;


public class Ellipse extends Shape {
    private double a ;
    private double b ;

    Ellipse(double a , double b){
        this.a = a ;
        this.b = b ;
    }
    @Override
    public double  getPerimeter(){
        return 4 * (Math.PI * a * b + (a - b) * (a - b)) / (a + b);
    }

    double getA (){
        return a;
    }
    void setA (double a){
        this.a = a;
    }
    double getB (){
        return b;
    }
    void setB(double b){
        this.b = b;
    }
}
