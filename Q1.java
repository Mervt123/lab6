public class Q1 {
    /*Write a program that reads an initial investment balance and an interest rate,
then prints the number of years it takes for the investment to reach one million
dollars*/
  private double balans;
  private int earns;
  private int year=0;

    public Q1(double balans, int earns) {
        this.balans = balans;
        this.earns = earns;
    }

    public double witeForbalans(int targetBalans)
 {
     while (balans<targetBalans)
     {
         year++;
         double interest=balans*earns/100;
       balans = balans + interest;
     }
     return balans;
 }

    public double getBalans() {
        return balans;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Q1{" +
                "balans=" + balans +
                ", earns=" + earns +
                ", year=" + year +
                '}';
    }
}
