package EngineCapacity.Domain;

public class EngineCapacity {
    private int capacity;

    public EngineCapacity(int capacity){
        this.capacity = capacity;
    }


    public String showCapacity(){
        return capacity + "cc";
    }
}
