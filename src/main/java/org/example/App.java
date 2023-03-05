package org.example;

import org.example.system.controller.SystemController;
import org.example.wiseSaying.controller.WiseSayingController;
import org.example.wiseSaying.entity.WiseSaying;

import java.awt.*;
import java.util.*;
import java.util.List;


public class App {
    public void run() {
        System.out.println("==명언 앱 ==");
        long lastWiseSayingId = 1;
        SystemController systemController = new SystemController();
        WiseSayingController wiseSayingController = new WiseSayingController();

        List<WiseSaying> WiseSayingList = new ArrayList<>();
        while (true) {
            System.out.print("명령) ");
            //trim() : 좌우 공백 없는 String 반환
            String command = Container.getScanner().nextLine().trim();
            Rq rq = new Rq(command);

            switch (rq.getActionCode()) {
                case "종료":
                    systemController.exit();
                    return;

                case "등록":
                    wiseSayingController.write();
                    break;

                case "목록":
                    wiseSayingController.list();
                    break;

                case "삭제":
                    wiseSayingController.remove(rq);
                    break;

                case "수정":
                    wiseSayingController.modify(rq);
                    break;
            }
        }
    }
}
