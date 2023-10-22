public class MainFarm {
    public static void main(String[] args) {
        Animal cow = new Animal("MyFarm", "Cow");
        Animal sheep = new Animal("YourFarm", "Sheep");

        cow.displayFarmInfo(); // Accessing the base class method
        cow.displayAnimalInfo(); // Accessing the derived class method

        sheep.displayFarmInfo();
        sheep.displayAnimalInfo();
    }
}
