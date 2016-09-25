/**
 * Created by Dassa on 19/09/2016.
 *
 */
public class Fiction extends Book {
    public Fiction() {}
    public Fiction(String title) {
        super(title);
        setPrice();
    }

    public void setPrice() {
        super.price = 24.99;

    }

}
