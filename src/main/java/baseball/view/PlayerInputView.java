package baseball.view;

import java.util.Scanner;

public class PlayerInputView {

    private final Scanner sc = new Scanner(System.in); // 입력 버퍼 입력하는거 아직 미숙달

    public String getPlayerInput() {
        System.out.println("숫자를 입력해주세요 : ");
        return sc.nextLine();
    }

}
