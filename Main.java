import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер задания: ");
        String nomer = scanner.nextLine();
        switch(nomer) {
            case "1":
                System.out.println(n1(scanner)); //последнее число
                break;
            case "2":
                System.out.println(n2(scanner));
                break;
            case "3":
                System.out.println(n3(scanner));
                break;
            case "4":
                System.out.println(n4(scanner));
                break;
            case "5":
                System.out.println(n5(scanner));
                break;
            case "6":
                n6(scanner);
                break;
            case "7":
                n7(scanner);
                break;
            case "8":
                n8();
                break;
            case "9":
                n9();
                break;
            case "10":
                n10();
                break;

        }

    }

    public static int n1(Scanner scan){
        System.out.println("Введите число: ");
        int num = scan.nextInt();
        return num%10;

    }

    public static int n2(Scanner scan){
        System.out.println("Введите число: ");
        int num = scan.nextInt();
        int sum = num%10;
        num = num/10;
        sum = sum+num%10;
        num = num/10;
        sum = sum+num;
        return sum;

    }

    public static int n3(Scanner scan){
        System.out.println("Введите число: ");
        int num = scan.nextInt();
        if (num>0){
            return num+1;
        } else {
            return num;
        }

    }

    public static int n4(Scanner scan){
        System.out.println("Введите число: ");
        int num = scan.nextInt();
        if (num>0){
            return num+1;
        } else if(num == 0) {
            return 10;
        } else{
            return num - 2;
        }

    }

    public static int n5(Scanner scan){
        System.out.println("Введите 3 числа: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        if (num1 < num2 && num1 < num3 ){
            return num1;
        } else if (num2 < num1 && num2 < num3 ){
                return num2;
        } else {
            return num3;
        }

    }

    public static void n6(Scanner scan){
        System.out.println("Введите число: ");
        int num = scan.nextInt();
        String a,b,c,d;
        a = "Положительное ";
        b = "Отрицательное ";
        c = "четное ";
        d = "нечетное ";
        String ans = "0";
        if (num == 0){
            System.out.println("Нулевое число");
        } else if(num>0) {
            ans = a;
        } else{
            ans = b;
        }
        if(num%2 == 0){
            ans = ans+c;
        } else {
            ans = ans+d;
        }
        System.out.println(ans+ "число");
    }

    public static void n7(Scanner scan){
        System.out.println("Введите номер региона: "); //905 194 491 800
        int num = scan.nextInt();
        switch (num){
            case 905:
                System.out.println("Москва. Стоимость разговора: 41.5");
                break;
            case 194:
                System.out.println("Ростов. Стоимость разговора: 19.8");
                break;
            case 491:
                System.out.println("Краснодар. Стоимость разговора: 26.9");
                break;
            case 800:
                System.out.println("Киров. Стоимость разговора: 50.0");
                break;
        }


    }

    public static void n8()
    {
        int arr[] = {1,-10,5,6,45,23, 45,-34,0,32,56,-1,2,-2};

        int maxValue = 0;
        int sumPos = 0;
        int sumNegEven = 0;
        int colPos = 0;
        int sumNeg = 0;
        int colNeg = 0;
        int mean = 0;
        System.out.println("Массив в задаче: ");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
            if (arr[i] > maxValue) maxValue = arr[i];
            if (arr[i] > 0) sumPos += arr[i];
            if (arr[i] < 0 && arr[i] % 2 == 0) sumNegEven += arr[i];
            if (arr[i] > 0) colPos++;
            if (arr[i] < 0) sumNeg += arr[i];
            if (arr[i] < 0) colNeg += arr[i];
        }
        if(colNeg > 0)
        {
            mean = sumNeg / colNeg;
        }
        System.out.println();
        System.out.println("Максимальное значение "+ maxValue);
        System.out.println("Сумма положительных элементов "+sumPos);
        System.out.println("Сумма четных отрицательных элементов "+sumNegEven);
        System.out.println("Количество положительных элементов "+colPos);
        System.out.println("Среднее арифметическое отрицательных элементов "+mean);

    }

    public static void n9()
    {
        int arr[] = {15,10,51, 6, 5,3, 10,-34,0,32,56, 12,24, 52};
        System.out.println("Массив в задаче: ");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Массив в обратном порядке: ");
        for (int i = arr.length-1; i > -1; i--)
        {
            System.out.print(arr[i] +" " );
        }
    }

    public static void n10()
    {
        int arr[] = {15,10,0,-6,-5,3,0,-34,0,32,56,0,24,52};
        System.out.println("Массив в задаче: ");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        int arrN[] = new int[arr.length];
        int j= 0;
        System.out.println();

        for (int i = 0; i<arr.length;i++){
            if (arr[i] != 0){
                arrN[j] = arr[i];
                j++;
            }
        }
        System.out.println("Новый массив: ");
        for (int i = 0; i<arrN.length;i++){
            System.out.print(arrN[i]+" ");
            }
    }
}
