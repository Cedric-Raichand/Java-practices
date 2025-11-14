import java.util.Arrays;
import java.util.Scanner;
public class ADH {
    public static void main(String[] args) {
        Scanner sc5 = new Scanner(System.in);
        String name = "";
        while(name.isBlank()){
            System.out.println("Enter your name");
            name = sc5.nextLine();
        }
        System.out.println("hello " + name);

        countdown1(10);
        System.out.println();
        countdown2(10);
        System.out.println();
        countdown3(10);
        System.out.println();
        countdown4(10);
        System.out.println();

        for(int i = 1; i <= 3; i++) {
            System.out.println("outer: " +i);
            System.out.println();
            for(int j = 2; j <= 10; j+=2) {
                System.out.println("inner: " +j);
            }
            System.out.println();
        }
        for(int i = 1; i <= 10; i++) {
            if(i ==5){
                break;
            }
            System.out.println(i);
        }
        System.out.println();
        for(int i = 1; i <= 10; i++) {
            if(i == 5){
                continue;
            }
            System.out.println(i);
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        for(int i = 1; i <= 10; i++) {
            System.out.println(num+"*"+i+"="+num*i);
        }
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter your statement: ");
        String s = sc1.nextLine();
        String word = new StringBuilder(s).reverse().toString();
        System.out.println("the reversed string is: "+ word);
        System.out.println();

        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter your statement: ");
        String sentence = sc2.nextLine();
        for(int i = 0; i < sentence.length(); i++) {
            System.out.println("character at index " +(i) +" is : " + sentence.charAt(i));
        }


    }


    public static void countdown1(int n) {
        if(n>0){
            System.out.println(n);
            countdown1(n-1);
        }
        else{
            System.out.println("blastoff");
        }
    }
    public static void countdown2(int n) {
        if(n==0){
            System.out.println("blastoff");
        }
        else{
            System.out.println(n);
            countdown2(n-1);
        }
    }
    public static void countdown3(int n) {
        while(n>0){
            System.out.println(n);
            n -= 1;
        }
        System.out.println("blastoff");
    }
    public static void countdown4(int n) {
        for(int i = n; i >=1; i--) {
            System.out.println(i);

        }
        System.out.println("blastoff");
    }

}