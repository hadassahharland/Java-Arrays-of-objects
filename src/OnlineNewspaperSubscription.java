/**
 * Created by Dassa on 19/09/2016.
 *
 */
public class OnlineNewspaperSubscription extends NewspaperSubscription {
    public OnlineNewspaperSubscription(String name, String address) {
        super(name, address);
    }

    @Override
    public void setRate(String address) {
        if (address.indexOf('@') == -1) {
            rate = 0;
        }
        else {
            rate = 9;
        }
    }
}
