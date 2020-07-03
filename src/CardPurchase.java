public class CardPurchase {
    private double purchaseValue;
    private double discountRate;
    private double discount;
    private double total;


    public CardPurchase(double purchaseValue, double discountRate, double discount) {
        this.purchaseValue = purchaseValue;
        this.discountRate = discountRate;
        this.discount = discount;
        this.total = this.purchaseValue - this.discount;
    }

    public double getPurchaseValue() {
        return purchaseValue;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public double getDiscount() {
        return discount;
    }

    public double getTotal() {
        return total;
    }
}
