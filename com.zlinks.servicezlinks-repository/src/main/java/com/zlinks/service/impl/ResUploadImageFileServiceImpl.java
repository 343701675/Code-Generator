package com.zlinks.com.zlinks.service.impl;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import com.zlinks.com.zlinks.domain.ResUploadImageFile;
import com.zlinks.com.zlinks.service.ResUploadImageFileService;
import com.zlinks.com.zlinks.mapper.ResUploadImageFileDao;
import java.util.List;
import java.util.Map;

import com.hpxs.base.BaseMybatisDao;
import com.zlinks.core.mybatis.page.Pagination;

/**
 * Copyright (C), 2017-2020, BBG
 * FileName: AccountController
 * Author:   zhangjh
 * Date:     2018-7-9 18:51:43
 * Description:业务
 */
@Service("resUploadImageFileService")
public class ResUploadImageFileServiceImpl extends BaseMybatisDao<ResUploadImageFileDao> implements ResUploadImageFileService {

	@Autowired
	private ResUploadImageFileDao resUploadImageFileDao;

	@Override
	public ResUploadImageFile getById(int id) {
		return resUploadImageFileDao.getById(id);
	}

	@Override
	public int getListCount(ResUploadImageFile entity) {
		return resUploadImageFileDao.getListCount(entity);
	}

	@Override
	public List<ResUploadImageFile> getList(ResUploadImageFile entity) {
		List<ResUploadImageFile> resut = null;
		resut = resUploadImageFileDao.getList(entity);
		return resut;
	}

	@Override
	public int getListByMapCount(Map<String, Object> paramMap) {
		return resUploadImageFileDao.getListByMapCount(paramMap);
	}

	@Override
	public List<ResUploadImageFile> getListByMap(Map<String, Object> paramMap) {
		List<ResUploadImageFile> resut = null;
		resut = resUploadImageFileDao.getListByMap(paramMap);
		return resut;
	}

	@Override
    @Transactional(rollbackFor = Exception.class)
	public int update(ResUploadImageFile entity) {
		return resUploadImageFileDao.update(entity);
	}

	@Override
    @Transactional(rollbackFor = Exception.class)
	public int deleteById(int id) {
		return resUploadImageFileDao.deleteById(id);
	}

	@Override
    @Transactional(rollbackFor = Exception.class)
	public int add(ResUploadImageFile entity) {
		return resUploadImageFileDao.add(entity);
	}

	@Override
    @Transactional(rollbackFor = Exception.class)
	public int addList(List<ResUploadImageFile> entityList) {
		return resUploadImageFileDao.addList(entityList);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Pagination<ResUploadImageFile> findPage(Map<String,Object> paramMap, Integer pageNo,
			Integer pageSize) {
		return super.findPage(paramMap, pageNo, pageSize);
	}

	@Override
	public List<ResUploadImageFile> getActivedList() {
		List<ResUploadImageFile> resut = null;
		ResUploadImageFile entity = new ResUploadImageFile();
		entity.setIsDeleted(0);
		resut = resUploadImageFileDao.getList(entity);
		return resut;
	}
}