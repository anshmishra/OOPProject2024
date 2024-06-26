/**
 * Represents a passenger with a name, age, and special service.
 * This class provides methods to get and set passenger details.
 *
 */

import java.io.Serializable;
public class Passenger implements Serializable{ 
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

    //getters and settes
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public SpecialService getSpecialService(){
        return specialService;
    }
    public void setSpecialService(SpecialService specialService){
        this.specialService=specialService;
    }
    

    //OVERRIDE : toString() for easier printing
    public String toString(){
        return "Passenger{" +"name='" + name + '\'' +", age=" + age +", specialService=" + specialService +'}';
    }
}
