package lotto;

import lotto.controller.LottoMainController;
import lotto.domain.*;

public class Application {
    public static void main(String[] args) {
        LottoManager lottoManager = new LottoManager(
                new CreateLotto(),
                new WinReward(),
                new ProfitRate());
        LottoMainController lottoController = new LottoMainController(lottoManager);
        lottoController.run();
    }
}