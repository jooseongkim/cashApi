package kr.co.gdu.cashapi.restController;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import kr.co.gdu.cashapi.service.CashStatsService;

@RestController
public class CashStatsRestController {
	@Autowired CashStatsService cashStatsService;
	/* Logger loger = LoggerFactory.getLogger(CashStatsRestController.class); */

	@GetMapping("/totalOutAndInByYear/{year}")
	public Map<String, Object> totalOutAndInByYear(@PathVariable(name = "year") int year){
		return cashStatsService.getTotalOutAndInByYear(year);
	}
	
	@GetMapping("totalMonthlyExpendituresByYear") //연도별 월간 총 지출액 금액
	public Map<String, Object> totalMonthlyExpendituresByYear() {
		return cashStatsService.getTotalMonthlyExpendituresByYear();
	}
}
