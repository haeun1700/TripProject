package codinnator.codinnator.model.service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LottoServiceImpl implements LottoService{
    private final Random random;

    @Autowired
    public LottoServiceImpl(Random random) {
		this.random = random;
	}


	/**
     * 로또 번호 6개 List로 반환
     */
	public List<Integer> generateNumbers() {
        return random.ints(1, 46) // 1~45 사이
                     .distinct()
                     .limit(6)
                     .boxed()
                     .collect(Collectors.toList());
    }
}
