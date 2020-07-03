public abstract class DiscountCard {

    private double discountRate;
    private double discount;
    private double turnover;
    private String owner;

    public DiscountCard(String owner, double turnover) {
        this.owner = owner;
        this.turnover = turnover;
    }


    protected void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    protected void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getDiscount() {
        return discount;
    }

    public double getTurnover() {
        return turnover;
    }


    public abstract CardPurchase calculatePurchase(double purchaseValue);


}

