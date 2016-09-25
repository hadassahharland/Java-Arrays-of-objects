/**
 * Created by Dassa on 19/09/2016.
 */
public class PhysicalNewspaperSubscription extends NewspaperSubscription {
    public PhysicalNewspaperSubscription(String name, String address) {
        super(name, address);
    }

    @Override
    public void setRate(String address) {
        if (address.length()==0) {
            rate = 0;
        }
        else {
            rate = 15;
        }
    }
}
