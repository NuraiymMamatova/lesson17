package HomeWork1;

        /*Author: Mamatova Nuraiym*/
        public class Main {
            public static void main(String[]args) {
                Sheep sheep1 = new Sheep(60.5,6,"black","male","Dolly");
                Sheep sheep2 = new Sheep(64.7,7,"white","male","Polly");
                Sheep sheep3 = new Sheep(58.2,5,"white-brown","female","Molly");

                Sheep[] sheep = {sheep1,sheep2,sheep3};

                Cow cow1 = new Cow(50.1,5,"white","male","Maika");
                Cow cow2 = new Cow(30.4,3,"white-black","male","Zoika");
                Cow cow3 = new Cow(41.1,5,"grey-black","female","Yellow");
                Cow cow4 = new Cow(45.4,4,"black","female","Dark");
                Cow cow5 = new Cow(30.2,2,"white","male","Low");

                Cow[] cows = {cow1,cow2,cow3,cow4,cow5};

                Horse horse1 = new Horse(51.3,3,"black","female","Babilon");
                Horse horse2 = new Horse(75.7,8,"brown","female","Spirit");

                Horse[] horses ={horse1,horse2};

                Farm1 farm1 = new Farm1("The lower reaches of the Syr Darya," +
                        " Media - the basis of the future Persian state",cows,horses,sheep,"Shirak" );

                Sheep sheep01 = new Sheep(9.1,1,"grey","female","Curly");
                Sheep[] sheep001 ={sheep01};
                Cow cow01=new Cow(25.5,2,"brown","male","Marta");
                Cow[] cow001 = {cow01};
                Horse horse01 = new Horse(33.2,9,"white","male","Ostwin");
                Horse[] horse001 = {horse01};
                Farm1 farm2 = new Farm1("Egypt, Arabian Peninsula, Sinai Peninsula",cow001,horse001,sheep001,"Moyses");
                System.out.println("----------Farm one----------");
                farm1.getInformationAboutFarms();

                System.out.println("----------Farm two----------");
                farm2.getInformationAboutFarms();


            }}

