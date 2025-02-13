package baseball.controller;

import java.util.List;

import baseball.model.ComputerInputData;
import baseball.view.PlayerInputView;
import main.java.baseball.model.BaseballCompareModel;
import main.java.baseball.service.BaseballGameService;

public class GameController {
    
    private PlayerInputView playerInputView;
    private BaseballGameService baseballGameService;
    private ComputerInputData computerInputData;
    private BaseballCompareModel gameModel;

    public GameController() {
        this.playerInputView = new PlayerInputView();
        this.baseballGameService = new BaseballGameService();
        this.computerInputData = new ComputerInputData();
        this.gameModel = new BaseballCompareModel();
    }


    public void gameFlow() {
        String input = playerInputView.getPlayerInput();

        if(baseballGameService.isValidInput(input)) {
            List<Integer> computerList = computerInputData.getComputerList();
            int[] result = gameModel.compareNumbers(input, computerList);

            if(result[1] == 3) {
                System.out.println("낫싱");
                break;
            }

            System.out.println(result[0]+"스트라이크"+result[1]+"볼");

            if(result[0] == 3) {
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                break;
            }
        } else {
            // 잘못된 입력 service 만들어야함.
            // IllegalArgumentException이라는데 알아볼 것
        }
    }

}
