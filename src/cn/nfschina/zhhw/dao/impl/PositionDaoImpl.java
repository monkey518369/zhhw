package cn.nfschina.zhhw.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.nfschina.zhhw.dao.BaseDao;
import cn.nfschina.zhhw.dao.PositionDao;
import cn.nfschina.zhhw.model.Position;

@Repository
public class PositionDaoImpl  extends BaseDao implements PositionDao{
	/* (non-Javadoc)
	 * @see cn.nfschina.zhhw.dao.PositionDao#getPosition(cn.nfschina.zhhw.model.Position)
	 */
	@Override
	public List<Position> getPosition(Position pos) {
		try{
			return this.getSqlMapClientTemplate().queryForList("getPosition",pos);
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}


}
