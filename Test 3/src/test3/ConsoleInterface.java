package test3;


import java.util.Scanner;

public class ConsoleInterface {
    Scanner scanner = new Scanner(System.in);

    public void out(String input){
        System.out.print(input);
    }

    public void outln(String input){
        System.out.println(input);
    }

    public String in(){
        System.out.println("");
        return scanner.nextLine();
    }

    public String in(String text){
        System.out.println(text);
        return scanner.nextLine();
    }
}
