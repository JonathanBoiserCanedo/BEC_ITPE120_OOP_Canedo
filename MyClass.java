public class MyClass {
    private static int instanceCount = 0;
    private String data;

    public MyClass(String data) {
        this.data = data;
        instanceCount++;
    }

    public void displayData() {
        System.out.println("Counted: " + data);
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    public static void main(String[] args) {
        MyClass count1 = new MyClass("Instance 1");
        MyClass count2 = new MyClass("Instance 2");
        MyClass count3 = new MyClass("Instance 3");

        System.out.println("Number of instances created: " + MyClass.getInstanceCount());

        // Displaying data for each instance
        count1.displayData();
        count2.displayData();
        count3.displayData();
    }
}
