package jp.ac.uryukuy.ie.e205759;

public class Main {
    public static void main(String[] args){
        System.out.println("main method runs");
        Chatbot bot1 = new Chatbot();
        Chatbot bot2 = new Chatbot("ああ");
        bot2.greeting();
        bot2.setName("おお");
        System.out.println(bot2.getName());
        bot1.greeting();
        bot2.greeting();

        
    }
    
}
