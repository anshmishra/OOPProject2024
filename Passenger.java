/**
 * Represents a passenger with a name, age, and special service.
 * This class provides methods to get and set passenger details.
 *
 */

public class Passenger {
    private String name;
    private int age;
    private SpecialService specialService;

    /**
     * Constructs a Passenger object with the given name, age, and special service.
     *
     * @param name the name of the passenger
     * @param age the age of the passenger
     * @param specialService the special service associated with the passenger
     */
    //Constructor
    public Passenger(String name, int age, SpecialService specialService){
        this.name=name;
        this.age=age;
        this.specialService=specialService;
    }

    //getters and setters
    /**
     * Gets the name of the passenger.
     *
     * @return the name of the passenger
     */
    public String getName(){
        return name;
    }
    /**
     * Sets the name of the passenger.
     *
     * @param name the name of the passenger
     */
    public void setName(String name){
        this.name=name;
    }
    /**
     * Gets the age of the passenger.
     *
     * @return the age of the passenger
     */
    public int getAge(){
        return age;
    }
    /**
     * Sets the age of the passenger.
     *
     * @param age the age of the passenger
     */
    public void setAge(int age){
        this.age=age;
    }
    /**
     * Gets the special service associated with the passenger.
     *
     * @return the special service associated with the passenger
     */
    public SpecialService getSpecialService(){
        return specialService;
    }
    /**
     * Sets the special service associated with the passenger.
     *
     * @param specialService the special service associated with the passenger
     */
    public void setSpecialService(SpecialService specialService){
        this.specialService=specialService;
    }

    //OVERRIDE : toString() for easier printing
    public String toString(){
        return "Passenger{" +"name='" + name + '\'' +", age=" + age +", specialService=" + specialService +'}';
    }
}
