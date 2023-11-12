package lotto.domain;

import camp.nextstep.edu.missionutils.Randoms;
import lotto.constant.LottoConstant;
import lotto.util.CreateLottoNum;
import java.util.List;


public class CreateLotto implements CreateLottoNum{
    @Override
    public List<Integer> pickUniqueNumbers() {
        return Randoms.pickUniqueNumbersInRange(
        LottoConstant.LOTTO_MIN_NUM.getValue(),
                LottoConstant.LOTTO_MAX_NUM.getValue(),
                LottoConstant.LOTTO_SIZE.getValue()
        );
    }
}