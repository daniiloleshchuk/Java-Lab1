package ua.lviv.iot.Lab1;

public class Drug {

    private static int priceOfPack;

    protected String nameOfDrug;

    protected String howToUse;

    private int volumeOfActiveSubstanceInMg;

    private String activeSubstance;

    private int maxDosesPerDay;

    private String colorOfDrug;

    private int quantityInBox;

    public Drug() {
    }

    public Drug(int volumeOfActiveSubstanceInMg, String activeSubstance, int maxDosesPerDay, String colorOfDrug, int quantityInBox) {
        this(null, null, volumeOfActiveSubstanceInMg, activeSubstance, maxDosesPerDay, colorOfDrug, quantityInBox);
    }

    public Drug(String nameOfDrug, String howToUse, int volumeOfActiveSubstanceInMg, String activeSubstance, int maxDosesPerDay, String colorOfDrug, int quantityInBox) {
        this.nameOfDrug = nameOfDrug;
        this.howToUse = howToUse;
        this.volumeOfActiveSubstanceInMg = volumeOfActiveSubstanceInMg;
        this.activeSubstance = activeSubstance;
        this.maxDosesPerDay = maxDosesPerDay;
        this.colorOfDrug = colorOfDrug;
        this.quantityInBox = quantityInBox;
    }
    
    public void resetValues(int priceOfPack,String nameOfDrug, String howToUse, int volumeOfActiveSubstanceInMg, String activeSubstance, int maxDosesPerDay, String colorOfDrug, int quantityInBox){
        Drug.priceOfPack = priceOfPack;
        this.nameOfDrug = nameOfDrug;
        this.howToUse = howToUse;
        this.volumeOfActiveSubstanceInMg = volumeOfActiveSubstanceInMg;
        this.activeSubstance = activeSubstance;
        this.maxDosesPerDay = maxDosesPerDay;
        this.colorOfDrug = colorOfDrug;
        this.quantityInBox = quantityInBox;
    }

    public static int getPriceOfPack() {
        return priceOfPack;
    }

    public static void setPriceOfPack(int priceOfPack) {
        Drug.priceOfPack = priceOfPack;
    }

    public String getNameOfDrug() {
        return nameOfDrug;
    }

    public void setNameOfDrug(String nameOfDrug) {
        this.nameOfDrug = nameOfDrug;
    }

    public String getHowToUse() {
        return howToUse;
    }

    public void setHowToUse(String howToUse) {
        this.howToUse = howToUse;
    }

    public int getVolumeOfActiveSubstanceInMg() {
        return volumeOfActiveSubstanceInMg;
    }

    public void setVolumeOfActiveSubstanceInMg(int volumeOfActiveSubstanceInMg) {
        this.volumeOfActiveSubstanceInMg = volumeOfActiveSubstanceInMg;
    }

    public String getActiveSubstance() {
        return activeSubstance;
    }

    public void setActiveSubstance(String activeSubstance) {
        this.activeSubstance = activeSubstance;
    }

    public int getMaxDosesPerDay() {
        return maxDosesPerDay;
    }

    public void setMaxDosesPerDay(int maxDosesPerDay) {
        this.maxDosesPerDay = maxDosesPerDay;
    }

    public String getColorOfDrug() {
        return colorOfDrug;
    }

    public void setColorOfDrug(String colorOfDrug) {
        this.colorOfDrug = colorOfDrug;
    }

    public int getQuantityInBox() {
        return quantityInBox;
    }

    public void setQuantityInBox(int quantityInBox) {
        this.quantityInBox = quantityInBox;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Drug{" +
                "nameOfDrug='" + nameOfDrug + '\'' +
                ", howToUse='" + howToUse + '\'' +
                ", volumeOfActiveSubstanceInMg=" + volumeOfActiveSubstanceInMg +
                ", activeSubstance='" + activeSubstance + '\'' +
                ", maxDosesPerDay=" + maxDosesPerDay +
                ", colorOfDrug='" + colorOfDrug + '\'' +
                ", quantityInBox=" + quantityInBox +
                '}';
    }
}
