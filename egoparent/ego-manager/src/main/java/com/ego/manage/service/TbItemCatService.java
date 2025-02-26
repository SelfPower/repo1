package com.ego.manage.service;

import com.ego.commons.pojo.EasyUiTree;

import java.util.List;

public interface TbItemCatService {
    /**
     * 根据父菜单id查询菜单
     * @param pid
     * @return
     */
    List<EasyUiTree> show(long pid);
}
