package baseball.service;

import camp.nextstep.edu.missionutils.Console;

public class MoreGameService {
    InvalidInputHandler invalidInputHandler;

    public MoreGameService() {
        this.invalidInputHandler = new InvalidInputHandler();
    }


    public boolean more() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String input = Console.readLine();
        if ("1".equals(input)) {
            return true;
        } else if ("2".equals(input)) {
            return false;
        } else {
            invalidInputHandler.invalidInputPrint();
            return false;
        }
    }
    
}
