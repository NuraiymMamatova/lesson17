package HomeWork2;


public  class Squar extends Shape{

    private int x;

    Squar(int x){
        this.x = x;
    }
    @Override
    public double getPerimeter(){
        return x*4;
    }
    int getX(){
        return x;
    }
    void setX(int x ){
        this.x = x;

    }


}
