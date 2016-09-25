/**
 * Created by Dassa on 18/09/2016.
 *
 */
public abstract class Book {
    protected String title;
    protected double price;

    public Book(){}

    public Book(String title)
    {
        this.title = title;
    }

    public String getTitle()
    {
        return title;
    }

    public double getPrice()
    {
        return price;
    }
    public abstract void setPrice();

    public String toString()
    {
        return("The book is called " + title + " and its price is $" + price);
    }
}
