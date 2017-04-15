package Game;

public class PlayerStats {

    private int numLaps;
    private int numSkips;
    private double rentExpenses;
    private double rentIncome;
    private double propertyExpenses;

    /**
     * Class constructor.
     * Initalizes empty player statitics.
     */
    public PlayerStats() {
        this.numLaps = 0;
        this.numSkips = 0;
        this.rentExpenses = 0.0;
        this.rentIncome = 0.0;
        this.propertyExpenses = 0.0;
    }

    public void addLap() {
        this.numLaps++;
    }

    public void addSkip() {
        this.numSkips++;
    }

    public void addRentExpense(double value) {
        this.rentExpenses += value;
    }

    public void addRentIncome(double value) {
        this.rentIncome += value;
    }

    public void addPropertyExpense(double value) {
        this.propertyExpenses += value;
    }

    public int getNumLaps() {
        return this.numLaps;
    }

    public int getNumSkips() {
        return this.numSkips;
    }

    public double getRentExpenses() {
        return this.rentExpenses;
    }

    public double getRentIncome() {
        return this.rentIncome;
    }

    public double getPropertyExpenses() {
        return this.propertyExpenses;
    }

}
