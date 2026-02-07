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

    public List<Integer> generateNumbers() {
        // 2. 숫자를 상수로 교체하는 모습 시연
        return random.ints(MIN_NUMBER, MAX_NUMBER) 
                     .distinct()
                     .limit(SELECT_COUNT)
                     .boxed()
                     .sorted()
                     .collect(Collectors.toList());
    }
	
}
