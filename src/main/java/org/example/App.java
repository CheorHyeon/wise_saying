package org.example;

import java.util.Scanner;

public class App {

    private final Scanner sc;

    public App(Scanner sc) {
        this.sc = sc;
        System.out.println("==명언 앱 ==");
    }

    public void run() {

        while (true) {
            System.out.print("명령) ");
            //trim() : 좌우 공백 없는 String 반환
            String command = sc.nextLine().trim();

            if (command.equals("종료")) {
                break;
            }

            if (command.equals("등록"))
            {
                System.out.print("명언 :");
                String content = sc.nextLine().trim();
                System.out.print("작가 :");
                String authorName = sc.next().trim();
            }

        }
    }
}
