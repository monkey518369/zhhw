package cn.nfschina.zhhw.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.nfschina.zhhw.dao.DeviceManageDao;
import cn.nfschina.zhhw.model.DeviceInfo;
import cn.nfschina.zhhw.service.DeviceManageService;

@Service
public class DeviceManageServiceImpl implements DeviceManageService{
	
	@Resource
	private DeviceManageDao deviceManageDao;
	@Override
	public List<DeviceInfo> getAllDevice(DeviceInfo deviceInfo) {
		// TODO Auto-generated method stub
		return deviceManageDao.getAllDevice(deviceInfo);
	}

	@Override
	public void addDevice(DeviceInfo deviceInfo) {
		// TODO Auto-generated method stub
		deviceManageDao.addDevice(deviceInfo);
	}

	@Override
	public void updDevice(DeviceInfo deviceInfo) {
		// TODO Auto-generated method stub
		deviceManageDao.updDevice(deviceInfo);
	}

	@Override
	public void delDevice(DeviceInfo deviceInfo) {
		// TODO Auto-generated method stub
		deviceManageDao.delDevice(deviceInfo);
	}

}
