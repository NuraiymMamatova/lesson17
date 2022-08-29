package HomeWork1;

import HomeWork1.DomesticAnimal;

        import java.util.Arrays;

public class Farm1 extends DomesticAnimal {
    private String address;
    private Cow [] cows;
    private Horse []horses;
    private Sheep []sheep;
    private String ownerName;


    Farm1(String address, Cow[] cows, Horse []horses, Sheep[]sheep, String ownerName) {

        this.address=address;
        this.cows =cows;
        this.horses=horses;
        this.sheep=sheep;
        this.ownerName=ownerName;
    }


    void getInformationAboutFarms(){

        System.out.println("Address: "+getAddress());

        System.out.println("\tOwner name: "+getOwnerName());

        System.out.println("------------Cows------------");
        for (Cow i: cows) {
            System.out.println(i);
        }
        System.out.println("------------Horses----------");
        for (Horse i:horses) {
            System.out.println(i);
        }
        System.out.println("------------Sheep-----------");
        for (Sheep i: sheep) {
            System.out.println(i);
        }

    }




    String getAddress(){
        return address;
    }

    void setAddress(String address){
        this.address = address;
    }
    Cow[] getCows(){
        return cows;
    }
    void setCows(Cow[] cows){
        this.cows = cows;
    }
    Horse[] getHorses(){
        return horses;
    }
    void setHorses(Horse[] horses){
        this.horses = horses;
    }
    Sheep [] getSheep(){
        return sheep;
    }
    void setSheep(Sheep[] sheep){
        this.sheep = sheep;
    }
    String getOwnerName(){
        return ownerName;
    }
    void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "HomeWork1.Farm1{" +
                "address='" + address + '\'' +
                ", cows=" + Arrays.toString(cows) +
                ", horses=" + Arrays.toString(horses) +
                ", sheep=" + Arrays.toString(sheep) +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}


