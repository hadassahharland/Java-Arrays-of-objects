/**
 * Created by Dassa on 19/09/2016.
 *
 */
public abstract class NewspaperSubscription {
    protected String name;
    protected String address;
    protected double rate;

    public NewspaperSubscription(String name, String address) {
        this.name = name;
        this.address = address;
        setRate(address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getRate() {
        return rate;
    }

    public abstract void setRate(String address);

    public void display() {
        System.out.println(name + " has a subscription to be sent to "+ address + " for a rate of " + rate);
    }


}
