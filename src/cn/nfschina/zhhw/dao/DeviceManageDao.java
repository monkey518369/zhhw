package cn.nfschina.zhhw.dao;

import java.util.List;

import cn.nfschina.zhhw.model.DeviceInfo;

public interface DeviceManageDao {

	List<DeviceInfo> getAllDevice(DeviceInfo deviceInfo);

	void addDevice(DeviceInfo deviceInfo);

	void updDevice(DeviceInfo deviceInfo);

	void delDevice(DeviceInfo deviceInfo);

}
