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
        Set<Integer> uniqueNumbers = new HashSet<>();

        while (uniqueNumbers.size() < 3) {
            uniqueNumbers.add(Randoms.pickNumberInRange(1, 9));
        }

        List<Integer> randomList = new ArrayList<>(uniqueNumbers);
        Collections.shuffle(randomList);

        return randomList;
    }

    public List<Integer> getComputerList() {
        return computerList;
    }
}
