public class Lab23 {
    public static void main(String[] args) {
        phone phone = new phone();
        phone phone1 = new phone("Samsung","200","12");
        phone phone2 = new phone("Iphone","15");
        phone.receiveCall("Artur");
        phone.receiveCall("Artem","7981323414");
        phone.sendMessage("7981323414", "7981323412", "7981323413");
        phone.sendMessage("7981323414", "7981323412");

    }
}

class phone{
    String model, weight, number;

    public phone(String model, String weight, String number){
        this.model = model;
        this.weight = weight;
        this.number = number;
    }

    public phone(String number, String model){
        this.number = number;
        this.model = model;
    }

    public phone(){
    }
    public void receiveCall(String name){
        System.out.println("Звонит"+name);
    }

    public void receiveCall(String name, String number){
        System.out.println("Имя: "+ name +" "+ "Номер: "+ number);
    }

    public void sendMessage(String...args){
        for(String number : args){
            System.out.println(number);
        }
    }
}
