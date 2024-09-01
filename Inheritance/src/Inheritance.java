public class Inheritance {
    public static void main(String[] args) throws Exception {
        Car myCar = new Car();
  
        // Honk() method from the Vehicle class
        myCar.honk();
    
        System.out.println(myCar.brand + " " + myCar.getModelName());
    }
}
