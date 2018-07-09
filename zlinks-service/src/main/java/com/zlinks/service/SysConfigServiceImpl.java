package com.zlinks.zlinks-service/src/main/java/com/zlinks/service/.impl;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import com.zlinks.zlinks-repository/src/main/java/com/zlinks/domain/.SysConfig;
import com.zlinks.zlinks-service/src/main/java/com/zlinks/service/.SysConfigService;
import com.zlinks.zlinks-repository/src/main/java/com/zlinks/mapper/.SysConfigDao;
import java.util.List;
import java.util.Map;

import com.hpxs.base.BaseMybatisDao;
import com.zlinks.core.mybatis.page.Pagination;

/**
 * 类说明:
 *
 * Created by noname on 2018-7-7 15:34:59
 */
@Service("sysConfigService")
public class SysConfigServiceImpl extends BaseMybatisDao<SysConfigDao> implements SysConfigService {

	@Autowired
	private SysConfigDao sysConfigDao;

	@Override
	public SysConfig getById(int id) {
		return sysConfigDao.getById(id);
	}

	@Override
	public int getListCount(SysConfig entity) {
		return sysConfigDao.getListCount(entity);
	}

	@Override
	public List<SysConfig> getList(SysConfig entity) {
		List<SysConfig> resut = null;
		resut = sysConfigDao.getList(entity);
		return resut;
	}

	@Override
	public int getListByMapCount(Map<String, Object> paramMap) {
		return sysConfigDao.getListByMapCount(paramMap);
	}

	@Override
	public List<SysConfig> getListByMap(Map<String, Object> paramMap) {
		List<SysConfig> resut = null;
		resut = sysConfigDao.getListByMap(paramMap);
		return resut;
	}

	@Override
	public int update(SysConfig entity) {
		return sysConfigDao.update(entity);
	}

	@Override
	public int deleteById(int id) {
		return sysConfigDao.deleteById(id);
	}

	@Override
	public int add(SysConfig entity) {
		return sysConfigDao.add(entity);
	}

	@Override
	public int addList(List<SysConfig> entityList) {
		return sysConfigDao.addList(entityList);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Pagination<SysConfig> findPage(Map<String,Object> paramMap, Integer pageNo,
			Integer pageSize) {
		return super.findPage(paramMap, pageNo, pageSize);
	}

	@Override
	public List<SysConfig> getActivedList() {
		List<SysConfig> resut = null;
		SysConfig entity = new SysConfig();
		entity.setIsDeleted(0);
		resut = sysConfigDao.getList(entity);
		return resut;
	}
}