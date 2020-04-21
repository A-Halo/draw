package com.java.behavioral.Mediator;

public class Client {
    public static void main(String[] args) {
        AbstractChatroom happChat=new CharGroup();
        Member member1,member2,member3,member4;
        member1=new DiamondMember("张三");
        member2=new DiamondMember("李四");
        member3=new CommonMember("王五");
        member4=new CommonMember("小明");

        happChat.register(member1);
        happChat.register(member2);
        happChat.register(member3);
        happChat.register(member4);

        member1.sendText("李四","李四","你好");
        member2.sendText("张三","张三","你好");
        member3.sendImage("小明","小明","谢谢");
    }

}
