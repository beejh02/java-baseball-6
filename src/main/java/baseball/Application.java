package baseball;

import baseball.controller.GameController;

public class Application {
    public static void main(String[] args) {
        GameController gameController = new GameController(); // GameController 객체 생성
        gameController.gameFlow(); // 게임 흐름 실행
    }
}