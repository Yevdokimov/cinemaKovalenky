package mainPackage;


public class Hall {
    private String nameHall;
    private int row;
    private int seat;
    private double priceCoefficient;
    protected boolean[][] numberSeats;

    public Hall(String nameHall, int row, int seat, double priceCoefficient) {
        this.nameHall = nameHall;
        this.row = row;
        this.seat = seat;
        this.priceCoefficient = priceCoefficient;
    }
}
