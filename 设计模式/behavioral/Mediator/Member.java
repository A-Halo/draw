package com.java.behavioral.Mediator;

public abstract class Member {
    protected AbstractChatroom chatroom;
    protected String name;
    public Member(String name){
        this.name=name;
    }

    public AbstractChatroom getChatroom() {
        return chatroom;
    }

    public void setChatroom(AbstractChatroom chatroom) {
        this.chatroom = chatroom;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public abstract void sendText(String from, String to, String message);
    public abstract void sendImage(String from, String to, String message);
    public void receiveText(String from,String message){
        System.out.println(from+"发送文本给"+this.name+"内容为"+message);
    }
    public void receiveImage(String from,String image){
        System.out.println(from+"发送文本给"+this.name+"内容为"+image);
    }
}
