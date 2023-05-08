public class OOPLibrary {
    private String name;
    private String email;
    private String gender;
    private double price;
    private int quantity;


    public OOPLibrary(String name, String email, String gender, Double price, int quantity) {
        setName(name);
        setEmail(email);
        setGender(gender);
        setPrice(price);
        setQuantity(quantity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
