public abstract class Abs extends Override {
    private int income;
    private String foodname;

    public  int getincome()
    {
        return income;
    }
    public void animal()
    {
        System.out.println("the animal is dog");
    }
    public abstract String animalfood(String foodname);
}
