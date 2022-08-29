package HomeWork1;

public abstract class DomesticAnimal {
    private double weight;
    private int age;
    private String color;
    private String gender;
    private String nickName;

    public DomesticAnimal() {

    }

    @Override
    public String toString() {
        return "DomesticAnimal{" +
                "weight=" + weight +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", gender='" + gender + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }

    DomesticAnimal(double weight, int age, String color, String gender, String nickName){
        this.weight = weight;
        this.age = age;
        this.color = color;
        this.gender = gender;
        this.nickName=nickName;

    }
    public double getWeight(){
        return weight;
    }
    void setWeight(double weight){
        this.weight = weight;
    }
    public int getAge(){
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }
    String getColor(){
        return color;
    }
    void setColor(String color){
        this.color = color;
    }
    String getGender(){
        return gender;
    }
    void setGender(String gender){
        this.gender = gender;
    }
    String getNickName(){
        return nickName;
    }
    void setNickName(){
        this.nickName = nickName;
    }
}


