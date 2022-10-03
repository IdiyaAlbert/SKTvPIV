public class Lab22 {
    public static void main(String[] args) {
        Dog dog = new Dog("Корм", "Будка");
        Cat cat = new Cat("Рыба", "Диван");
        Horse horse = new Horse("Злаки", "Пастбище");
        Veterinar vet = new Veterinar();
        dog.getName();
        vet.treatAnimal(cat);
    }


}

class Animal{
    String food,location;
    public void makeNoise(){
        System.out.println("Golos zhivotnogo");
    }
    public void eat(){
        System.out.println("eda");
    }
    public void sleep(){
        System.out.println("Eto zhivotnoe spit");
    }
}

class Dog extends Animal{
    private String name = "Собака";
    public void getName(){
        System.out.println(name);
    }
    public Dog (String food, String location){
        this.food = food;
        this.location=location;;
    }
    @Override
    public void makeNoise(){
        System.out.println("Gav gav");
    }

    @Override
    public void eat(){
        System.out.println("Sobaka est");
    }
}

class Cat extends Animal{
    private String name = "Кот";
    public void getName(){
        System.out.println(name);
    }
    public Cat (String food, String location){
        this.food = food;
        this.location=location;;
    }
    @Override
    public void makeNoise(){
        System.out.println("Meow Meow");
    }

    @Override
    public void eat(){
        System.out.println("Kot est");
    }
}

class Horse extends Animal{
    private String name = "Лошадь";
    public void getName(){
        System.out.println(name);
    }
    public Horse (String food, String location){
        this.food = food;
        this.location=location;;
    }
    @Override
    public void makeNoise(){
        System.out.println("Igogo");
    }

    @Override
    public void eat(){
        System.out.println("Loshad est");
    }
}

class Veterinar{
    public void treatAnimal(Animal animal){
        System.out.println(animal.food+" "+animal.location);
    }
}
