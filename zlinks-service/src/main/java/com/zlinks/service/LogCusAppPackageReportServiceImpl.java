package com.zlinks.zlinks-service/src/main/java/com/zlinks/service/.impl;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import com.zlinks.zlinks-repository/src/main/java/com/zlinks/domain/.LogCusAppPackageReport;
import com.zlinks.zlinks-service/src/main/java/com/zlinks/service/.LogCusAppPackageReportService;
import com.zlinks.zlinks-repository/src/main/java/com/zlinks/mapper/.LogCusAppPackageReportDao;
import java.util.List;
import java.util.Map;

import com.hpxs.base.BaseMybatisDao;
import com.zlinks.core.mybatis.page.Pagination;

/**
 * Copyright (C), 2017-2020, BBG
 * FileName: AccountController
 * Author:   zhangjh
 * Date:     2018-7-9 16:02:00
 * Description:业务
 */
@Service("logCusAppPackageReportService")
public class LogCusAppPackageReportServiceImpl extends BaseMybatisDao<LogCusAppPackageReportDao> implements LogCusAppPackageReportService {

	@Autowired
	private LogCusAppPackageReportDao logCusAppPackageReportDao;

	@Override
	public LogCusAppPackageReport getById(int id) {
		return logCusAppPackageReportDao.getById(id);
	}

	@Override
	public int getListCount(LogCusAppPackageReport entity) {
		return logCusAppPackageReportDao.getListCount(entity);
	}

	@Override
	public List<LogCusAppPackageReport> getList(LogCusAppPackageReport entity) {
		List<LogCusAppPackageReport> resut = null;
		resut = logCusAppPackageReportDao.getList(entity);
		return resut;
	}

	@Override
	public int getListByMapCount(Map<String, Object> paramMap) {
		return logCusAppPackageReportDao.getListByMapCount(paramMap);
	}

	@Override
	public List<LogCusAppPackageReport> getListByMap(Map<String, Object> paramMap) {
		List<LogCusAppPackageReport> resut = null;
		resut = logCusAppPackageReportDao.getListByMap(paramMap);
		return resut;
	}

	@Override
    @Transactional(rollbackFor = Exception.class)
	public int update(LogCusAppPackageReport entity) {
		return logCusAppPackageReportDao.update(entity);
	}

	@Override
    @Transactional(rollbackFor = Exception.class)
	public int deleteById(int id) {
		return logCusAppPackageReportDao.deleteById(id);
	}

	@Override
    @Transactional(rollbackFor = Exception.class)
	public int add(LogCusAppPackageReport entity) {
		return logCusAppPackageReportDao.add(entity);
	}

	@Override
    @Transactional(rollbackFor = Exception.class)
	public int addList(List<LogCusAppPackageReport> entityList) {
		return logCusAppPackageReportDao.addList(entityList);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Pagination<LogCusAppPackageReport> findPage(Map<String,Object> paramMap, Integer pageNo,
			Integer pageSize) {
		return super.findPage(paramMap, pageNo, pageSize);
	}

	@Override
	public List<LogCusAppPackageReport> getActivedList() {
		List<LogCusAppPackageReport> resut = null;
		LogCusAppPackageReport entity = new LogCusAppPackageReport();
		entity.setIsDeleted(0);
		resut = logCusAppPackageReportDao.getList(entity);
		return resut;
	}
}