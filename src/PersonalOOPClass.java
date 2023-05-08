public class PersonalOOPClass {
    private String item;
    private String store;
    private double quantity;
    private double price;

    private boolean hasDiscountCard;
    private boolean discount;
    private double pay2get3;

    public PersonalOOPClass(String item, String store, double quantity, double price, boolean hasDiscountCard, boolean hasDiscount) {
        setItem(item);
        setStore(store);
        setQuantity(quantity);
        setPrice(price);
        setHasDiscountCard(hasDiscountCard);
        setPay2get3(pay2get3);
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean hasDiscountCard() {
        return hasDiscountCard;
    }

    public void setHasDiscountCard(boolean hasDiscountCard) {
        this.hasDiscountCard = hasDiscountCard;
        if (hasDiscountCard) {
            setDiscount(true);
        }
    }

    public void setDiscount(boolean discount) {
        if (hasDiscountCard && !discount) {
            price = price * 0.8; // apply 20% discount
        }
    }
    public double getPay2get3() {
        return pay2get3;
    }

    public void setPay2get3(double pay2get3) {
        this.pay2get3 = pay2get3;
        if (quantity == 3) {
            double totalPrice = price * quantity;
            double discountedPrice = price * 2; // pay for 2 items and get the 3rd for free
            this.pay2get3 = discountedPrice; // update the pay2get3 field
            price = discountedPrice / quantity; // update the price per item
        }
    }
}