package Assignment4;

public class Animal {
    private String name;
    private String species;
    private String food;
    private String shelter;

    public Animal(){

    }

    public Animal(String name, String species, String food, String shelter){
        this.name = name;
        this.species = species;
        this.food = food;
        this.shelter = shelter;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public String getFood() {
        return food;
    }

    public String getShelter() {
        return shelter;
    }

}
