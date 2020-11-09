package kr.co.gdu.cashapi.restController;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.gdu.cashapi.service.CashStatsService;

@RestController
public class CashStatsRestController {
	@Autowired CashStatsService cashStatsService;
	/* Logger loger = LoggerFactory.getLogger(CashStatsRestController.class); */

	
	@GetMapping("totalMonthlyExpendituresByYear")
	public Map<String, Object> totalMonthlyExpendituresByYear() {
		return cashStatsService.getTotalMonthlyExpendituresByYear();
	}
}
