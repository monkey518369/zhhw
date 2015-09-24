package cn.nfschina.zhhw.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.nfschina.zhhw.dao.BaseDao;
import cn.nfschina.zhhw.dao.DeviceManageDao;
import cn.nfschina.zhhw.model.DeviceInfo;

@Repository
public class DeviceManageDaoImpl extends BaseDao implements DeviceManageDao{
	
	@Override
	public List<DeviceInfo> getAllDevice(DeviceInfo deviceInfo) {
		// TODO Auto-generated method stub
		return this.getSqlMapClientTemplate().queryForList("getAllDeviceInfo",deviceInfo);
	}
	
	@Override
	public void addDevice(DeviceInfo deviceInfo) {
		this.getSqlMapClientTemplate().insert("addDevice",deviceInfo);
	}

	@Override
	public void updDevice(DeviceInfo deviceInfo) {
		// TODO Auto-generated method stub
		this.getSqlMapClientTemplate().update("updateDevice",deviceInfo);
	}

	@Override
	public void delDevice(DeviceInfo deviceInfo) {
		// TODO Auto-generated method stub
		this.getSqlMapClientTemplate().delete("deleteDevice",deviceInfo);
	}
}
