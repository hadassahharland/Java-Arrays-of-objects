/**
 * Created by Dassa on 19/09/2016.
 *
 */
public class OutgoingPhoneCall extends PhoneCall {
    public double rate;
    public double callTime;
    public OutgoingPhoneCall(String number, double callTime)
    {
        super(number);
        this.rate = 0.4;
        this.callTime = callTime;
        this.price = rate*callTime;
    }

    public String toString()
    {
        return "The phone number " + number + " made a call at a rate of " + rate + " for a time of " + callTime
                + " minutes, for a price of " + price;

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

    public void setCallTime(double callTime) {
        this.callTime = callTime;
    }
}