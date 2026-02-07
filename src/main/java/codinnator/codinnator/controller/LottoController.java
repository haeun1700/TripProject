package codinnator.codinnator.controller;

import codinnator.codinnator.model.service.LottoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // 1. 단순 빈(Component)이 아닌 웹 요청을 처리하는 컨트롤러로 선언
@RequestMapping("/api/lotto") // 2. 공통 URL 경로 설정 (예: http://localhost:8080/api/lotto)public class LottoController {

    private static final Logger logger = LoggerFactory.getLogger(LottoController.class);
    private final LottoService lottoService;

    @Autowired
    public LottoController(LottoService lottoService) {
        this.lottoService = lottoService;
    }

    // 3. GET 요청을 받아 로또 번호를 JSON으로 반환하는 메서드 추가
    @GetMapping
    public List<Integer> getLottoNumbers() {
        List<Integer> numbers = lottoService.generateNumbers();
        
        // 4. 서버 운영 시 확인을 위해 로그 남기기 (System.out 대신 권장)
        logger.info("요청에 의해 생성된 로또 번호: {}", numbers);

        return numbers; // 클라이언트(화면)에게 데이터 전송
    }
}