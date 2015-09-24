package cn.nfschina.zhhw.service;

import java.util.Date;
import java.util.Map;

public interface OnlineDatastatisticsService {

	public Map<String,Object> getOnlineByDay(String id,Date date);
	
}
