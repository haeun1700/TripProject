package codinnator.codinnator.controller;

import codinnator.codinnator.model.service.LottoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class LottoController {
    private final LottoService lottoService;

    @Autowired
	public LottoController(LottoService lottoService) {
		this.lottoService = lottoService;
	}

	public void printLottoNumbers() {
        System.out.println("이번 주 로또 번호: " + lottoService.generateNumbers());
    }
}
