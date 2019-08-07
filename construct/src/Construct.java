public class Construct {
    public String carname;
    public int price;
    public Construct(String carname,int price)
    {
        this.carname = carname;
        this.price = price;
    }
    public String getCarname()
    {
        return carname;
    }
    public  int getPrice()
    {
        return price;
    }
    public static void main(String[] args) throws Throwable {
        Construct car1 = new Construct("bmw",400000);
       System.out.println(car1.getPrice());
        car1.finalize();



    }
}
