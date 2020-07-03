public class GoldDiscountCard extends DiscountCard {

    public GoldDiscountCard(String owner,double turnover) {
        super(owner,turnover);
    }

    @Override
    public CardPurchase calculatePurchase(double purchaseValue) {

        this.setDiscountRate(2);


        if (this.getTurnover() > 200) {
            int goldDiscount = ((int) (this.getTurnover()) / (100));
            if (goldDiscount < 10) {
                this.setDiscountRate(goldDiscount);
            } else {
                this.setDiscountRate(10);
            }

        }

        this.setDiscount(((purchaseValue * getDiscountRate()) / 100));

        return new CardPurchase(purchaseValue,getDiscountRate(),getDiscount());

    }
}
