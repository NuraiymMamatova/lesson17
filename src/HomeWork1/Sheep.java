package HomeWork1;

    public  class Sheep extends DomesticAnimal{

        Sheep(double weight, int age, String color, String gender, String nickName) {
            super(weight, age, color, gender, nickName);
        }
        @Override
        public String toString() {
            return
                    "Nick name: "+        getNickName()+"\n"+
                            "Weight: "+        getWeight() +"\n"+
                            "Age: "+        getAge() +"\n"+
                            "Color: "+        getColor() +"\n"+
                            "Gender: "+        getGender() +"\n"

                    ;
        }
    }

