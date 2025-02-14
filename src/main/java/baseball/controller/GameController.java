package baseball.controller;

import java.util.List;

import baseball.model.ComputerInputData;
import baseball.view.PlayerInputView;
import baseball.model.BaseballCompareModel;
import baseball.service.BaseballGameService;
import baseball.service.InvalidInputHandler;
import baseball.service.MoreGameService;

public class GameController {
    
    private PlayerInputView playerInputView;
    private BaseballGameService baseballGameService;
    private ComputerInputData computerInputData;
    private BaseballCompareModel gameModel;
    private InvalidInputHandler invalidInputHandler;
    private MoreGameService moreGameService;

    public GameController() {
        this.playerInputView = new PlayerInputView();
        this.baseballGameService = new BaseballGameService();
        this.computerInputData = new ComputerInputData();
        this.gameModel = new BaseballCompareModel();
        this.invalidInputHandler = new InvalidInputHandler();
        this.moreGameService = new MoreGameService();
    }


    public void gameFlow() {
        boolean gameWon = false;

        while (!gameWon) {
            String input = playerInputView.getPlayerInput();

            if (!baseballGameService.isValidInput(input)) {
                invalidInputHandler.invalidInputPrint();
            }

            List<Integer> computerList = computerInputData.getComputerList();
            int[] result = gameModel.compareNumbers(input, computerList);

            if (result[0] == 3) {
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                gameWon = true;  // 게임 종료
                continue;
            }

            printGameResult(result);
            }
        if(moreGameService.more() == true) {
            computerInputData = new ComputerInputData();
            gameFlow();
        }
    }


    private void printGameResult(int[] result) {
        StringBuilder output = new StringBuilder();
    
        if (result[0] == 0 && result[1] == 0) {
            System.out.println("낫싱");
        } else {
            if (result[0] > 0) {
                output.append(result[0]).append("스트라이크 ");
            }
    
            if (result[1] > 0) {
                output.append(result[1]).append("볼");
            }
    
            if (output.length() > 0) {
                System.out.println(output);
            } else {
                System.out.println("낫싱");
            }
        }
    }
}