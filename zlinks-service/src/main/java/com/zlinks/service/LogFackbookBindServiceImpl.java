package com.zlinks.zlinks-service/src/main/java/com/zlinks/service/.impl;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import com.zlinks.zlinks-repository/src/main/java/com/zlinks/domain/.LogFackbookBind;
import com.zlinks.zlinks-service/src/main/java/com/zlinks/service/.LogFackbookBindService;
import com.zlinks.zlinks-repository/src/main/java/com/zlinks/mapper/.LogFackbookBindDao;
import java.util.List;
import java.util.Map;

import com.hpxs.base.BaseMybatisDao;
import com.zlinks.core.mybatis.page.Pagination;

/**
 * 类说明:
 *
 * Created by noname on 2018-7-7 15:34:58
 */
@Service("logFackbookBindService")
public class LogFackbookBindServiceImpl extends BaseMybatisDao<LogFackbookBindDao> implements LogFackbookBindService {

	@Autowired
	private LogFackbookBindDao logFackbookBindDao;

	@Override
	public LogFackbookBind getById(int id) {
		return logFackbookBindDao.getById(id);
	}

	@Override
	public int getListCount(LogFackbookBind entity) {
		return logFackbookBindDao.getListCount(entity);
	}

	@Override
	public List<LogFackbookBind> getList(LogFackbookBind entity) {
		List<LogFackbookBind> resut = null;
		resut = logFackbookBindDao.getList(entity);
		return resut;
	}

	@Override
	public int getListByMapCount(Map<String, Object> paramMap) {
		return logFackbookBindDao.getListByMapCount(paramMap);
	}

	@Override
	public List<LogFackbookBind> getListByMap(Map<String, Object> paramMap) {
		List<LogFackbookBind> resut = null;
		resut = logFackbookBindDao.getListByMap(paramMap);
		return resut;
	}

	@Override
	public int update(LogFackbookBind entity) {
		return logFackbookBindDao.update(entity);
	}

	@Override
	public int deleteById(int id) {
		return logFackbookBindDao.deleteById(id);
	}

	@Override
	public int add(LogFackbookBind entity) {
		return logFackbookBindDao.add(entity);
	}

	@Override
	public int addList(List<LogFackbookBind> entityList) {
		return logFackbookBindDao.addList(entityList);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Pagination<LogFackbookBind> findPage(Map<String,Object> paramMap, Integer pageNo,
			Integer pageSize) {
		return super.findPage(paramMap, pageNo, pageSize);
	}

	@Override
	public List<LogFackbookBind> getActivedList() {
		List<LogFackbookBind> resut = null;
		LogFackbookBind entity = new LogFackbookBind();
		entity.setIsDeleted(0);
		resut = logFackbookBindDao.getList(entity);
		return resut;
	}
}