public class Printer {
    int sheetsLeft;
    int toner;

    public Printer(int sheetsLeft, int toner){
        this.sheetsLeft = sheetsLeft;
        this.toner = toner;
    }

    public int getSheetsLeft(){
        return this.sheetsLeft;
    }

    public int getToner(){
        return this.toner;
    }

    public void print(int pages, int copies){
        int sheetsNeeded = pages * copies;
        if(sheetsNeeded <= sheetsLeft){
            sheetsLeft -= sheetsNeeded;
            toner -= sheetsNeeded;
        }
    }
}
