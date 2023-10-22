class Animal extends Farm {
    private String animalName;

    public Animal(String farmName, String animalName) {
        super(farmName); // Call the base class constructor using super
        this.animalName = animalName;
    }

    public void displayAnimalInfo() {
        System.out.println("Animal Name: " + animalName);
    }
}
