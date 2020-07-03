public class Store {


    public static void main(String[] args) {
        DiscountCard bronzeCard = new BronzeDiscountCard("Ivan",0);
        DiscountCard silverCard = new SilverDiscountCard("Dimityr",600);
        DiscountCard goldCard = new GoldDiscountCard("Dragan",1500);


        CardPurchase bronzeCardPurchase = bronzeCard.calculatePurchase(150);
        CardPurchase silverCardPurchase = silverCard.calculatePurchase(850);
        CardPurchase goldCardPurchase = goldCard.calculatePurchase(1300);

        printPurchase(bronzeCardPurchase);
        printPurchase(silverCardPurchase);
        printPurchase(goldCardPurchase);


    }

    private static void printPurchase(CardPurchase information) {


        System.out.println("Purchased value: $" + information.getPurchaseValue());
        System.out.println("Discount rate: " + information.getDiscountRate() + "%");
        System.out.println("Discount: $" + information.getDiscount());
        System.out.println("Total: $" + information.getTotal());
        System.out.println();

    }
}




