/**
 * Created by Dassa on 19/09/2016.
 *
 */
public abstract class Division {
    protected String division;
    protected String accountNo;

    public Division(String division, String accountNo) {
        this.division = division;
        this.accountNo = accountNo;
    }

    public abstract void display();

}


