public class RCCO {
    //here we have the first OOP, recipes
    private String recipes;
    private double price;
    private int quantity;
    private double time;


    public RCCO(String recipes, double price, int quantity, double time) {
        setRecipes(recipes);
        setPrice(price);
        setQuantity(quantity);
        setTime(time);
    }

    public String getRecipes() {
        return recipes;
    }

    public void setRecipes(String recipes) {
        this.recipes = recipes;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }
}