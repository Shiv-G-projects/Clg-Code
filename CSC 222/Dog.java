public class Dog
{
    private String name;
    private int age; //in years
    private double weight; //in pounds
    private String breed;
    private Boolean boosterShot;

    public Dog ()   // default constructor
    {
        name = "No name yet.";
        age = 0;
        weight = 0;
        breed = "None";
        boosterShot = false;
    }


    public Dog (String initialName, int initialAge,
            double initialWeight, String initialBreed, Boolean initialboosterShot)                  
    {
        name = initialName;
        if ((initialAge < 0) || (initialWeight < 0))
        {
            System.out.println ("Error: Negative age or weight.");
            System.exit (0);
        }
        else
        {
            age = initialAge;
            weight = initialWeight;
            breed = initialBreed;
            initialboosterShot = boosterShot;
        }
    }


    
    public void setName (String newName)
    {
        name = newName; //age and weight are unchanged.
    }


    public void setAge (int newAge)
    {
        if (newAge < 0)
        {
            System.out.println ("Error: Negative age.");
            System.exit (0);
        }
        else
            age = newAge;
        //name and weight are unchanged.
    }
    public void setWeight (double newWeight)
    {
        if (newWeight < 0)
        {
            System.out.println ("Error: Negative weight.");
            System.exit (0);
        }
        else
            weight = newWeight; //name and age are unchanged.
    }

    public void setBreed (String newBreed)
    {
            breed = newBreed;
    }

    public void setBooster (Boolean newBooster)
    {
            boosterShot = newBooster;
    }

    public String getName ()
    {
        return name;
    }

    public String getBreed ()
    {
        return breed;
    }

    public int getAge ()
    {
        return age;
    }

    public Boolean getboosterShot ()
    {
        return boosterShot;
    }      

    public double getWeight ()
    {
        return weight;
    }


    public void writeOutput ()
    {
        System.out.println ("Name: " + name);
        System.out.println ("Age: " + age + " years");
        System.out.println ("Weight: " + weight + " pounds");
        System.out.println ("Breed: " + breed);
        System.out.println ("Boosters: " + boosterShot);
    }
}