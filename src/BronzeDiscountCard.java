public class BronzeDiscountCard extends DiscountCard {

    public BronzeDiscountCard(String owner,double turnover) {
        super(owner,turnover);
    }

    @Override
    public CardPurchase calculatePurchase(double purchaseValue) {

        if (this.getTurnover() > 100 && this.getTurnover() < 300) {
            this.setDiscountRate(1);
        }
        if (this.getTurnover() > 300) {
            this.setDiscountRate(2.5);
        }
        this.setDiscount((purchaseValue * getDiscountRate()) / 100);

        return new CardPurchase(purchaseValue,getDiscountRate(),getDiscount());

    }


}




