package com.zlinks.zlinks-service.impl;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import com.zlinks.entity.LogUserLogin;
import com.zlinks.zlinks-service.LogUserLoginService;
import com.zlinks.zlinks-repsitory.LogUserLoginDao;
import java.util.List;
import java.util.Map;

import com.hpxs.base.BaseMybatisDao;
import com.zlinks.core.mybatis.page.Pagination;

/**
 * 类说明:
 *
 * Created by noname on 2018-7-7 15:28:42
 */
@Service("logUserLoginService")
public class LogUserLoginServiceImpl extends BaseMybatisDao<LogUserLoginDao> implements LogUserLoginService {

	@Autowired
	private LogUserLoginDao logUserLoginDao;

	@Override
	public LogUserLogin getById(int id) {
		return logUserLoginDao.getById(id);
	}

	@Override
	public int getListCount(LogUserLogin entity) {
		return logUserLoginDao.getListCount(entity);
	}

	@Override
	public List<LogUserLogin> getList(LogUserLogin entity) {
		List<LogUserLogin> resut = null;
		resut = logUserLoginDao.getList(entity);
		return resut;
	}

	@Override
	public int getListByMapCount(Map<String, Object> paramMap) {
		return logUserLoginDao.getListByMapCount(paramMap);
	}

	@Override
	public List<LogUserLogin> getListByMap(Map<String, Object> paramMap) {
		List<LogUserLogin> resut = null;
		resut = logUserLoginDao.getListByMap(paramMap);
		return resut;
	}

	@Override
	public int update(LogUserLogin entity) {
		return logUserLoginDao.update(entity);
	}

	@Override
	public int deleteById(int id) {
		return logUserLoginDao.deleteById(id);
	}

	@Override
	public int add(LogUserLogin entity) {
		return logUserLoginDao.add(entity);
	}

	@Override
	public int addList(List<LogUserLogin> entityList) {
		return logUserLoginDao.addList(entityList);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Pagination<LogUserLogin> findPage(Map<String,Object> paramMap, Integer pageNo,
			Integer pageSize) {
		return super.findPage(paramMap, pageNo, pageSize);
	}

	@Override
	public List<LogUserLogin> getActivedList() {
		List<LogUserLogin> resut = null;
		LogUserLogin entity = new LogUserLogin();
		entity.setIsDeleted(0);
		resut = logUserLoginDao.getList(entity);
		return resut;
	}
}