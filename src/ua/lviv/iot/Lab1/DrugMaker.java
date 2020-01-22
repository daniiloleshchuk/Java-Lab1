package ua.lviv.iot.Lab1;

public class DrugMaker {
    public static void main(String[] args) {
        Drug essentiale = new Drug();
        Drug karvalol = new Drug(50,"α-bromisovalerianic acid ethyl ester, phenobarbital, peppermint oil",50,"transparent",1);
        Drug anaferon = new Drug("Anaferon","Use after eating",15,"some active subtance",8,"white",20);

        System.out.println("\n");
        System.out.println(essentiale.toString());
        System.out.println("\n");
        System.out.println(karvalol.toString());
        System.out.println("\n");
        System.out.println(anaferon.toString());
        System.out.println("\n\n\n");

        Drug[] arrayOfDrugs = new Drug[4];
        int counter=0;
        do {
            arrayOfDrugs[counter]= new Drug();
            counter++;

        } while (counter<4);

        for (Drug i: arrayOfDrugs) {
            System.out.println(i.toString());
            System.out.println("\n");
        }
    }
}
