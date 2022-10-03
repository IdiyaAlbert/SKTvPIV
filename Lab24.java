public class Lab24 {
    public static void main(String[] args) {
        Engine engine = new Engine("12", "SupaEngine");
        Lorry lorry = new Lorry("Toyo","300",engine,200);
        SportCar car = new SportCar("mazda","100", engine, 300);
        lorry.printInfo();
        car.printInfo();
    }
}

class Engine{
    String horsePower, brand;
    public Engine(String horsePower, String brand){
        this.brand = brand;
        this.horsePower = horsePower;
    }
}

abstract class Car{
    String brand, weight, carClass;
    Engine engine;
    public abstract void start();
    public abstract void stop();
    public abstract void printInfo();
    public void turnRight(){
        System.out.println("Поворот направо");
    }

    public void turnLeft(){
        System.out.println("Поворот наlevo");
    }

}

class Lorry extends Car{
    int gruz;
    @Override
    public void start(){
        System.out.println("Грузовик поехал");
    }
    @Override
    public void stop(){
        System.out.println("Грузовик остановился");
    }

    @Override
    public void printInfo(){
        System.out.println(brand + " " + weight + " " + carClass +  " "
                            + engine.horsePower +  " " + engine.brand +" "+ gruz);
    }

    public Lorry(String brand,String weight, Engine engine, int gruz){
        this.brand = brand;
        this.weight = weight;
        this.carClass = "Lorry";
        this.engine = engine;
        this.gruz = gruz;
    }
}

class SportCar extends Car{
    int maxSpeed;
    @Override
    public void start(){
        System.out.println("Спорткар поехал");
    }
    @Override
    public void stop(){
        System.out.println("Спорткар остановился");
    }

    @Override
    public void printInfo(){
        System.out.println(brand + " " + weight + " " + carClass +  " "
                + engine.horsePower +  " " + engine.brand +" "+ maxSpeed);
    }

    public SportCar(String brand,String weight, Engine engine, int maxSpeed){
        this.brand = brand;
        this.weight = weight;
        this.carClass = "Lorry";
        this.engine = engine;
        this.maxSpeed = maxSpeed;
    }
}