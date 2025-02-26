package com.ego.dubbo.service.impl;

import javax.annotation.Resource;

import com.ego.dubbo.service.TbItemDescDubboService;
import com.ego.mapper.TbItemDescMapper;
import com.ego.pojo.TbItemDesc;
import org.springframework.beans.factory.annotation.Autowired;

public class TbItemDescDubboServiceImpl implements TbItemDescDubboService {
	@Autowired
	private TbItemDescMapper tbItemDescMapper;
	@Override
	public int insDesc(TbItemDesc itemDesc) {
		return tbItemDescMapper.insert(itemDesc);
	}

	@Override
	public TbItemDesc selByItemid(long itemid) {
		System.out.println(itemid);
		return tbItemDescMapper.selectByPrimaryKey(itemid);
	}

}
