package com.company;

import com.company.interfaces.ICommunicationType;

import java.util.Scanner;


public class Console implements ICommunicationType {
    private Scanner input = new Scanner(System.in);
    private Bot bot = new Bot();

    public Console() {
        start();
    }

    private void start() {
        sendMsg(bot.getWelcomeMsg());
        while (true) {
            getMsg(input.nextLine(), "console");
        }
    }

    public void getMsg(String update, String id) {
        bot.communicate(update);
        sendMsg(bot.answer);
    }

    private void sendMsg(String str) {
        System.out.println(str);
    }
}
