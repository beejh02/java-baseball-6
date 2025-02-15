package baseball.model;

import java.util.List;
import java.util.stream.Collectors;

public class BaseballCompareModel {
    
// 사용자 입력과 컴퓨터 숫자 비교
public int[] compareNumbers(String playerInput, List<Integer> computerList) {
    int strikeCount = 0;
    int ballCount = 0;

    // computerList를 String으로 변환
    String computerString = computerList.stream().map(String::valueOf).collect(Collectors.joining());

    // 스트라이크 계산 // + 여기도 stream 쓰고 싶은데 아직 잘 모르겠음.
    for (int i = 0; i < 3; i++) {
        if (playerInput.charAt(i) == computerString.charAt(i)) {
            strikeCount++;
        }
    }

    // 볼 계산
    for (int i = 0; i < 3; i++) {
        if (playerInput.charAt(i) != computerString.charAt(i) && computerString.contains(String.valueOf(playerInput.charAt(i)))) {
            ballCount++;  // 볼
        }
    }

    return new int[]{strikeCount, ballCount};
}
}