package comparatorandcomparable;

import java.util.Comparator;

public class Laptop  implements Comparator<Laptop>{
    private String company;
    private int price;
    private int ramsize;

    public Laptop() {
    }

    public Laptop(String company, int price, int ramsize) {
        this.company = company;
        this.price = price;
        this.ramsize = ramsize;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRamsize() {
        return ramsize;
    }

    public void setRamsize(int ramsize) {
        this.ramsize = ramsize;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "company='" + company + '\'' +
                ", price=" + price +
                ", ramsize=" + ramsize +
                '}';
    }
    @Override
    public int compare(Laptop lap1, Laptop lap2) {
        System.out.println("Inside compare method ()"+this.getClass());
        if(lap1.getPrice()<lap2.getPrice())
        {return 1;}
        else
            return -1;
    }
  /*  @Override
    public int compareTo(Laptop laptop) {
        if(this.getRamsize()> laptop.getRamsize())
        {

            return 1;
        }else{
            return -1;
        }

    }*/


}
