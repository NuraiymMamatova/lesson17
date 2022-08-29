package HomeWork2;

import HomeWork2.Shape;
    public class Сircle extends Shape {

        private double r;
        public Сircle(double r){
            this.r=r;
        }
        @Override
        public double getPerimeter() {
            return 2*Math.PI*r;
        }
        double getR(){
            return r;
        }
        void setR (double r){
            this.r = r;
        }
    }
