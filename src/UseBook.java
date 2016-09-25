/**
 * Created by Dassa on 19/09/2016.
 *
 */
public class UseBook {
    public static void main(String[] args) {
        Fiction oliverTwist = new Fiction("Oliver Twist");
        System.out.println(oliverTwist.toString());
        NonFiction dictionary = new NonFiction("Oxford Dictionary");
        System.out.println(dictionary.toString());

    }

}
