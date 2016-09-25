/**
 * Created by Dassa on 19/09/2016.
 */
public class DemoSubscriptions {
    public static void main(String[] args) {
        PhysicalNewspaperSubscription one = new PhysicalNewspaperSubscription("Mary", "");
        one.display();
        OnlineNewspaperSubscription two = new OnlineNewspaperSubscription("Jane", "");
        two.display();
        PhysicalNewspaperSubscription three = new PhysicalNewspaperSubscription("Robert", "4 main st");
        three.display();
        OnlineNewspaperSubscription four = new OnlineNewspaperSubscription("Alex", "alex@gmail.com");
        four.display();
    }
}
