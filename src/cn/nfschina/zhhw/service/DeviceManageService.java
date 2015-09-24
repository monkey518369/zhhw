package cn.nfschina.zhhw.service;

import java.util.List;

import cn.nfschina.zhhw.model.DeviceInfo;

public interface DeviceManageService {

	List<DeviceInfo> getAllDevice(DeviceInfo deviceInfo);

	void addDevice(DeviceInfo deviceInfo);

	void updDevice(DeviceInfo deviceInfo);

	void delDevice(DeviceInfo deviceInfo);

}
