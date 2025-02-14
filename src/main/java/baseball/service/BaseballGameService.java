package baseball.service;

import java.util.HashSet;
import java.util.Set;

public class BaseballGameService {
    
    public boolean isValidInput(String input) {
        if(input.length() != 3) { //3자리 체크
            return false;
        }

        boolean onlyNumber = input.chars().allMatch(Character::isDigit);
        if(!onlyNumber) {
            return false;
        }

        Set<Character> charSet = new HashSet<>();
        for (char c : input.toCharArray()) {
            charSet.add(c);
        }

        if(charSet.size() != 3) {
            return false;
        }

        return true;

    }


}
