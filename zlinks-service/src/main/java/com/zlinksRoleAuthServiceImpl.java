package com.zlinks.zlinks-service.impl;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import com.zlinks.entity.RoleAuth;
import com.zlinks.zlinks-service.RoleAuthService;
import com.zlinks.zlinks-repsitory.RoleAuthDao;
import java.util.List;
import java.util.Map;

import com.hpxs.base.BaseMybatisDao;
import com.zlinks.core.mybatis.page.Pagination;

/**
 * 类说明:
 *
 * Created by noname on 2018-7-7 15:28:42
 */
@Service("roleAuthService")
public class RoleAuthServiceImpl extends BaseMybatisDao<RoleAuthDao> implements RoleAuthService {

	@Autowired
	private RoleAuthDao roleAuthDao;

	@Override
	public RoleAuth getById(int id) {
		return roleAuthDao.getById(id);
	}

	@Override
	public int getListCount(RoleAuth entity) {
		return roleAuthDao.getListCount(entity);
	}

	@Override
	public List<RoleAuth> getList(RoleAuth entity) {
		List<RoleAuth> resut = null;
		resut = roleAuthDao.getList(entity);
		return resut;
	}

	@Override
	public int getListByMapCount(Map<String, Object> paramMap) {
		return roleAuthDao.getListByMapCount(paramMap);
	}

	@Override
	public List<RoleAuth> getListByMap(Map<String, Object> paramMap) {
		List<RoleAuth> resut = null;
		resut = roleAuthDao.getListByMap(paramMap);
		return resut;
	}

	@Override
	public int update(RoleAuth entity) {
		return roleAuthDao.update(entity);
	}

	@Override
	public int deleteById(int id) {
		return roleAuthDao.deleteById(id);
	}

	@Override
	public int add(RoleAuth entity) {
		return roleAuthDao.add(entity);
	}

	@Override
	public int addList(List<RoleAuth> entityList) {
		return roleAuthDao.addList(entityList);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Pagination<RoleAuth> findPage(Map<String,Object> paramMap, Integer pageNo,
			Integer pageSize) {
		return super.findPage(paramMap, pageNo, pageSize);
	}

	@Override
	public List<RoleAuth> getActivedList() {
		List<RoleAuth> resut = null;
		RoleAuth entity = new RoleAuth();
		entity.setIsDeleted(0);
		resut = roleAuthDao.getList(entity);
		return resut;
	}
}