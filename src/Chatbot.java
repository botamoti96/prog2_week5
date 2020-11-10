package jp.ac.uryukuy.ie.e205759;

public class Chatbot {
    private String name;

    public Chatbot(){
        System.out.println("Chatbotの原型を作成します");
    }

    public Chatbot(String _name){
        this.name = _name;
        System.out.println("Chatbot名" + this.name + "を作成します");
    }

    public void greeting(){
        System.out.println("はじめまして" + name + "です。よろしくおねがいします");
    
    }
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
}
