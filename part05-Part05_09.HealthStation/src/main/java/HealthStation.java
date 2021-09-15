
public class HealthStation {
    
    //private int weightPerson;
    private int numberOfWeighings;
    
    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        
        int weightPerson = person.getWeight();
        this.numberOfWeighings++;
        return weightPerson;
        
    }
    
    public void feed(Person person) {
        
        person.setWeight(person.getWeight() + 1);
        
    }
    
    public int weighings() {
        
        
        return numberOfWeighings;
    }

}
