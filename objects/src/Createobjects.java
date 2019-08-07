public  class Createobjects extends Override{
    private String name;
    private Integer age;
    private Integer weight;
    private Integer bmi;



    public  String getName()
    {
        return  name;
    }
    public Integer getAge()
    {
        return  age;
    }
    public  Integer getAge(int age,int weight)
    {
        return (age + weight);


    }
    public  void emi()
    {
        System.out.println("the loan had been sanctioned");
    }
    public void nocost()
    {
        System.out.println("No cost emi is available");
    }
    public void animal()
    {
        System.out.println("the animal is cat");
    }

    public static void main(String[] args) throws Throwable {
        Createobjects obj = new Createobjects();
        obj.animal();
        obj.finalize();
        Override obj2 = new Override();
        obj2.animal();


    }

}
