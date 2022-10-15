import java.util.*;


public class Lab31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        switch (scan.nextLine()){
            case "1":
                n1(scan);
                break;
            case "2":
                n2(scan);
                break;
            case "3":
                n3(scan);
                break;
            case "4":
                n4(scan);
                break;
            case "5":
                n5(scan);
                break;
            case "6":
                n6(scan);
                break;
            case "7":
                n7(scan);
                break;
            case "8":
                n8(scan);
                break;
            case "9":
                n9(scan);
                break;
            case "10":
                n10(scan);
                break;
            case "11":
                n11(scan);
                break;
            case "12":
                n12(scan);
                break;
            case "13":
                n13(scan);
                break;
            case "14":
                n14(scan);
                break;
            case "15":
                n15(scan);
                break;
            case "16":
                n16(scan);
                break;
            case "17":
                n17(scan);
                break;
            case "18":
                n18(scan);
                break;
        }
    }

    public static void n1(Scanner scan ) {
        StringBuilder text = new StringBuilder(scan.nextLine());
        StringBuilder textrev = text.reverse();
        String text1 = text.toString();
        String textrev1 = textrev.toString();
        System.out.println(text1.equals(textrev1));
    }

    public static void n2(Scanner scan){
        String text = scan.nextLine();
        char[] arr = text.toCharArray();
        String a="";
        a = a + arr[0];
        for(int i = 1; i< arr.length;i++){
            if(arr[i]!=arr[i-1]){
                a= a+arr[i];
            }
        }
        System.out.println(a);
    }

    public static void n3(Scanner scan){
        String text1 = scan.nextLine();
        String text2 = scan.nextLine();
        char[] arr1 = text1.toLowerCase().toCharArray();
        char[] arr2 = text2.toLowerCase().toCharArray();
        for (int i = arr1.length - 1; i > 0; i--)
        {
            for (int j = 0; j < i; j++)
            {
                if (arr1[j] > arr1[j + 1])
                {
                    char tmp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = tmp;
                }
            }
        }
        for (int i = arr2.length - 1; i > 0; i--)
        {
            for (int j = 0; j < i; j++)
            {
                if (arr2[j] > arr2[j + 1])
                {
                    char tmp = arr2[j];
                    arr2[j] = arr2[j + 1];
                    arr2[j + 1] = tmp;
                }
            }
        }
        text1 = String.valueOf(arr1);
        text2 = String.valueOf(arr2);
        text1 = text1.replace(" ","");
        text2 = text2.replace(" ","");
        System.out.println(text1+"     "+text2);
        System.out.println(text1.equalsIgnoreCase(text2));


    }

    public static void n4(Scanner scan){
        String text1 = scan.nextLine();
        String text2 = scan.nextLine();
        if(text1.compareTo(text2)==0){
            System.out.println("лексикографически равны");
        } else {
            System.out.println("лексикографически неравны");
        }


    }

    public static void n5(Scanner scan){
        String text1 = scan.nextLine().toLowerCase();
        String text2 = scan.nextLine().toLowerCase();
        if(text1.compareTo(text2)==0){
            System.out.println("лексикографически равны");
        } else {
            System.out.println("лексикографически неравны");
        }
    }

    public static void n6(Scanner scan){
        String text1 = scan.nextLine();
        String text2 = scan.nextLine();
        text1 = text1 + text2;
        System.out.println(text1);
    }

    public static void n7(Scanner scan){
        String text1 = scan.nextLine();
        StringBuilder a = new StringBuilder();
        int kolvo =  scan.nextInt();
        for(int i =0;i<=kolvo;i++){
            a.append(scan.nextLine());
        }
        System.out.println(text1.equals(a.toString()));
    }

    public static void n8(Scanner scan){
        String text1 = scan.nextLine();
        String text2 = scan.nextLine();
        if (text1.length()>text2.length()) {
            System.out.println(text1.endsWith(text2));
        } else {
            System.out.println(text1.endsWith(text2));
        }
    }

    public static void n9(Scanner scan){
        String text1 = scan.nextLine();
        String text2 = scan.nextLine();

        System.out.println(text1.equals(text2));
    }

    public static void n10(Scanner scan){
        System.out.println(scan.nextLine().length());
    }

    public static void n11(Scanner scan){
        System.out.println(scan.nextLine().toLowerCase());
    }

    public static void n12(Scanner scan){
        System.out.println(scan.nextLine().toUpperCase());
    }

    public static void n13(Scanner scan){
        String text = scan.nextLine();
        char[] arr = text.toCharArray();
        int[] arr1 = new int[text.length()];
        for(int i=0;i< arr1.length; i++){
            arr1[i] = 0;
        }
        for(int i=0;i< arr1.length; i++){
            for (int j=0;j<arr1.length;j++){
                if(arr[i]==text.charAt(j)){
                    arr1[i]++;
                }
            }
        }
        int maxnum = 0;
        int num1= 0;
        int temp = 0;
        for(int i =0;i<arr1.length;i++){
            if(arr1[i]>maxnum){
                maxnum = arr1[i];
                temp=num1;
                num1 = i;
            }
        }
        System.out.println(text.charAt(temp));
    }

    public static void n14(Scanner scan){
        String str = scan.nextLine();
        Set<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray())
        {
            if (!set.contains(c))
            {
                set.add(c);
                sb.append(c);
            }
        }
        String result = sb.toString();
        System.out.println(result);
    }

    public static void n15(Scanner scan) {

        String str = scan.nextLine();
        char ch;
        int index;
        int lastindex;

        for(int i=0; i<str.length(); i++) {
            ch = str.charAt(i);
            index = str.indexOf(ch);
            lastindex = str.lastIndexOf(ch);

            if(index == lastindex) {
                System.out.println(ch);
                break;
            }
        }
    }

    public static void n16(Scanner scan){
        String text = scan.nextLine();
        if((text.charAt(1)== text.charAt(text.length()-1) && text.charAt(2)== text.charAt(text.length()) ||
                (text.charAt(1)== text.charAt(text.length()) && text.charAt(2)== text.charAt(text.length()-1)))){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }

    public static void n17(Scanner scan){
        String text = scan.nextLine();
        char[] arr = text.toCharArray();
        int[] arr1 = new int[text.length()];
        for(int i=0;i< arr1.length; i++){
            arr1[i] = 0;
        }
        for(int i=0;i< arr1.length; i++){
            for (int j=0;j<arr1.length;j++){
                if(arr[i]==text.charAt(j)){
                    arr1[i]++;
                }
            }
        }
        int kolvo = 0;
        for (int i =0;i<arr1.length;i++){
            if(arr1[i]==3){
                kolvo++;
            }
        }
        System.out.println(kolvo/3);
    }

    public static void n18(Scanner scan){
        String text = scan.nextLine();
        int summ = 0;
        String value = text.replaceAll("[^0-9]","");
        for(char ch:value.toCharArray()){
            System.out.println(ch);
            summ = summ+Integer.parseInt(String.valueOf(ch));
        }
        System.out.println(summ);
    }

}