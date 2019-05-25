/*
Autorzy: Aleksander Mojzych, Adrian Matyszczak 25.05.2019
 */
public class Customer
{
    private int ID;
    private String name;
    private int discount;

    public Customer(int ID, String name, int discount)
    {
        this.ID = ID;
        this.name = name;
        this.discount = discount;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
    public String toString()
    {
        return name+"("+ID+")";
    }
}
