package Assignment4;

public class Zoo {

    private Animal lion;
    private Animal tiger;
    private Animal elephant;

    public Zoo(){
    }

    public Zoo (Animal lion, Animal tiger, Animal elephant){
        this.lion = lion;
        this.tiger = tiger;
        this.elephant = elephant;
    }

    public void zooInfo() {
        String infoLion = "Dier: " + lion.getName() + " - Soort: " + lion.getSpecies() + " - Voedsel: " + lion.getFood() + " - Verblijf: " + lion.getShelter();
        String infoTiger = "Dier: " + tiger.getName() + " - Soort: " + tiger.getSpecies() + " - Voedsel: " + tiger.getFood() + " - Verblijf: " + tiger.getShelter();
        String infoElephant = "Dier: " + elephant.getName() + " - Soort: " + elephant.getSpecies() + " - Voedsel: " + elephant.getFood() + " - Verblijf: " + elephant.getShelter();
        System.out.println(infoLion );
        System.out.println(infoTiger);
        System.out.println(infoElephant);
    }
}
