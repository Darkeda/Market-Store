public class SilverDiscountCard extends DiscountCard {

    public SilverDiscountCard(String owner,double turnover) {
        super(owner,turnover);
    }

    @Override
    public CardPurchase calculatePurchase(double purchaseValue) {

        this.setDiscountRate(2);

        if (this.getTurnover() > 300) {


            this.setDiscountRate(3.5);
        }

        this.setDiscount(((purchaseValue * getDiscountRate()) / 100));

        return new CardPurchase(purchaseValue, getDiscountRate(), getDiscount());

    }
}
