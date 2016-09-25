/**
 * Created by Dassa on 19/09/2016.
 *
 */
public class IncomingPhoneCall extends PhoneCall {
    public double rate;
    public IncomingPhoneCall(String number)
    {
        super(number);
        this.price = 0.2;
        this.rate = this.price;
    }

    public String toString()
    {
        return "The phone number " + number + " received a call at a rate of " + rate + " for a price of " + price;
    }

    @Override
    public String getNumber() {
        return null;
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }

    @Override
    public String getPrice() {
        return null;
    }
}