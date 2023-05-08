
public class PersonalOOP {
    public static void main(String[] args) {
        PersonalOOPClass ShoppingList01 = new PersonalOOPClass("Gem Lettuce", "WholeFoods", 3, 1, true, true);
        System.out.println(
                "Shopping list: "
                        + ShoppingList01.getItem() + ", in "
                        + ShoppingList01.getStore() + ", quantity: "
                        + ShoppingList01.getQuantity() + " price: "
                        + ShoppingList01.getPay2get3() + "£");
    }
}
