public class Printer {

    private int numberOfSheets;
    private int toner;

    public Printer(int numberOfSheets, int toner){
        this.numberOfSheets = numberOfSheets;
        this.toner = toner;
    }

    public int getNumberOfSheets() {
        return numberOfSheets;
    }

    public int getToner(){
        return toner;
    }

    public void print(int pages, int copies) {
        int sheetsNeeded = pages * copies;
        if (sheetsNeeded <= numberOfSheets){
            numberOfSheets -= sheetsNeeded;
            toner -= sheetsNeeded;
        }
    }
}
