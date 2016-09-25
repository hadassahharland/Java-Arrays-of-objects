/**
 * Created by Dassa on 19/09/2016.
 *
 */
public abstract class PhoneCall {
    protected String number;
    protected double price;

    public PhoneCall(String number) {
        this.number = number;
        this.price = 0.0;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract String getNumber();

    public abstract String getPrice();

    public abstract String toString();

}

