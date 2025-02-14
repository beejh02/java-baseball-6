package baseball.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import camp.nextstep.edu.missionutils.Randoms;

public class ComputerInputData {

    private List<Integer> computerList;

    public ComputerInputData() {
        computerList = picking();
    }

    public static List<Integer> picking() {
        Set<Integer> uniqueNumbers = new HashSet<>(); // 중복 없애려고 set 씀

        while (uniqueNumbers.size() < 3) {
            uniqueNumbers.add(Randoms.pickNumberInRange(1, 9));
        }

        List<Integer> randomList = new ArrayList<>(uniqueNumbers); // set 자료형 순서 저장 안해서 자바도 그런지는 모르겠는데 비교할거라 List로 변환
        Collections.shuffle(randomList); // 리스트 섞기

        return randomList;
    }

    public List<Integer> getComputerList() {
        return computerList;
    }
}

//     public static void main(String[] args) {
//         ComputerInputData computerInputData = new ComputerInputData();
//         System.out.println("컴퓨터가 생성한 랜덤 숫자: " + computerInputData.getComputerList());
//     }
// }
