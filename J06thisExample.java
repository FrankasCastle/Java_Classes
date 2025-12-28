public class J06thisExample {

    int modelYear;
    String modelName;

    public J06thisExample(String modelName) {
        this(2020, modelName);
    }

    public J06thisExample(int modelYear, String modelName){
        this.modelYear = modelYear;
        this.modelName = modelName;
    }

    public void printInfo(){
        System.out.println(modelYear + " " + modelName);
    }

    public static void main (String[] args) {
        J06thisExample car1 = new J06thisExample("Corvette");
        J06thisExample car2 = new J06thisExample(1969, "Mustang");

        car1.printInfo();
        car2.printInfo();
    }
}