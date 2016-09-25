/**
 * Created by Dassa on 19/09/2016.
 *
 */
public class InternationalDivision extends Division {
    protected String country;
    protected String lang;

    public InternationalDivision(String division, String accountNo, String country, String lang) {
        super(division, accountNo);
        this.country = country;
        this.lang = lang;
    }

    @Override
    public void display() {
        System.out.println("The Division " + division + "(Account number " + accountNo + ") is located in " + country
                + " and the local language is " + lang);


    }
}

