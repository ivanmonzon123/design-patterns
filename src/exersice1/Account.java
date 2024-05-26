package exersice1;

public class Account {
    private String title;
    private Double amount;

    public Account(String title, Double amount) {
        this.title = title;
        this.amount = amount;
    }

    public Account(String title) {
        this.title = title;
    }

    public void addAmount(Double amount) {
        this.amount = this.amount + amount;
    }

    public void withdrawAmount(Double amount) {
        this.amount = this.amount - amount;
    }

    public Double getAmount() {
        return this.amount;
    }

    public String getTitle() {
        return this.title;
    }

    @Override
    public String toString() {
        return "Title: " + this.title + "Amount: " + this.amount;
    }
}


