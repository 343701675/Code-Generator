package com.zlinks.service/.impl;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import com.zlinks.domain/.GmeNotifyUrlCopy;
import com.zlinks.service/.GmeNotifyUrlCopyService;
import com.zlinks.mapper/.GmeNotifyUrlCopyDao;
import java.util.List;
import java.util.Map;

import com.hpxs.base.BaseMybatisDao;
import com.zlinks.core.mybatis.page.Pagination;

/**
 * Copyright (C), 2017-2020, BBG
 * FileName: AccountController
 * Author:   zhangjh
 * Date:     2018-7-9 16:20:13
 * Description:业务
 */
@Service("gmeNotifyUrlCopyService")
public class GmeNotifyUrlCopyServiceImpl extends BaseMybatisDao<GmeNotifyUrlCopyDao> implements GmeNotifyUrlCopyService {

	@Autowired
	private GmeNotifyUrlCopyDao gmeNotifyUrlCopyDao;

	@Override
	public GmeNotifyUrlCopy getById(int id) {
		return gmeNotifyUrlCopyDao.getById(id);
	}

	@Override
	public int getListCount(GmeNotifyUrlCopy entity) {
		return gmeNotifyUrlCopyDao.getListCount(entity);
	}

	@Override
	public List<GmeNotifyUrlCopy> getList(GmeNotifyUrlCopy entity) {
		List<GmeNotifyUrlCopy> resut = null;
		resut = gmeNotifyUrlCopyDao.getList(entity);
		return resut;
	}

	@Override
	public int getListByMapCount(Map<String, Object> paramMap) {
		return gmeNotifyUrlCopyDao.getListByMapCount(paramMap);
	}

	@Override
	public List<GmeNotifyUrlCopy> getListByMap(Map<String, Object> paramMap) {
		List<GmeNotifyUrlCopy> resut = null;
		resut = gmeNotifyUrlCopyDao.getListByMap(paramMap);
		return resut;
	}

	@Override
    @Transactional(rollbackFor = Exception.class)
	public int update(GmeNotifyUrlCopy entity) {
		return gmeNotifyUrlCopyDao.update(entity);
	}

	@Override
    @Transactional(rollbackFor = Exception.class)
	public int deleteById(int id) {
		return gmeNotifyUrlCopyDao.deleteById(id);
	}

	@Override
    @Transactional(rollbackFor = Exception.class)
	public int add(GmeNotifyUrlCopy entity) {
		return gmeNotifyUrlCopyDao.add(entity);
	}

	@Override
    @Transactional(rollbackFor = Exception.class)
	public int addList(List<GmeNotifyUrlCopy> entityList) {
		return gmeNotifyUrlCopyDao.addList(entityList);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Pagination<GmeNotifyUrlCopy> findPage(Map<String,Object> paramMap, Integer pageNo,
			Integer pageSize) {
		return super.findPage(paramMap, pageNo, pageSize);
	}

	@Override
	public List<GmeNotifyUrlCopy> getActivedList() {
		List<GmeNotifyUrlCopy> resut = null;
		GmeNotifyUrlCopy entity = new GmeNotifyUrlCopy();
		entity.setIsDeleted(0);
		resut = gmeNotifyUrlCopyDao.getList(entity);
		return resut;
	}
}