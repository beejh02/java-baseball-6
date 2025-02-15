package baseball.model;

import java.util.List;
import java.util.stream.Collectors;

public class CompareBallsModel {


// 사용자 입력과 컴퓨터 숫자 비교
public int[] compareNumbers(String playerInput, List<Integer> computerList) {
    int strikeCount = 0;
    int ballCount = 0;

    String computerString = computerList.stream().map(String::valueOf).collect(Collectors.joining());

    for (int i = 0; i < 3; i++) {
        if (playerInput.charAt(i) == computerString.charAt(i)) {
            strikeCount++;
        }
    }

    for (int i = 0; i < 3; i++) {
        if (playerInput.charAt(i) != computerString.charAt(i) && computerString.contains(String.valueOf(playerInput.charAt(i)))) {
            ballCount++;
        }
    }

    return new int[]{strikeCount, ballCount};
}
}
