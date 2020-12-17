package Model;

public class Budget {
    private double profit;
    private double expenses;
    private double сurrentAmount;

    public Budget(double profit, double expenses, double сurrentAmount) {
        this.profit = profit;
        this.expenses = expenses;
        this.сurrentAmount = сurrentAmount;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public double getExpenses() {
        return expenses;
    }

    public void setExpenses(double expenses) {
        this.expenses = expenses;
    }

    public double getСurrentAmount() {
        return сurrentAmount;
    }

    public void setСurrentAmount(double сurrentAmount) {
        this.сurrentAmount = сurrentAmount;
    }
}
