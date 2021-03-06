package kr.co.gdu.cashapi.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.co.gdu.cashapi.mapper.CashStatsMapper;

@Service
@Transactional
public class CashStatsService {
	@Autowired
	CashStatsMapper cashStatsMapper;

	public Map<String, Object> getTotalMonthlyExpendituresByYear() {
		return cashStatsMapper.selectTotalMonthlyExpendituresByYear();
	}
	
	public Map<String, Object> getTotalOutAndInByYear(int year) {
		return cashStatsMapper.selectTotalOutAndInByYear(year);
	}
}
