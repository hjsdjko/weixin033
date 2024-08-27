package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.CaipinleixingDao;
import com.cl.entity.CaipinleixingEntity;
import com.cl.service.CaipinleixingService;
import com.cl.entity.view.CaipinleixingView;

@Service("caipinleixingService")
public class CaipinleixingServiceImpl extends ServiceImpl<CaipinleixingDao, CaipinleixingEntity> implements CaipinleixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CaipinleixingEntity> page = this.selectPage(
                new Query<CaipinleixingEntity>(params).getPage(),
                new EntityWrapper<CaipinleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CaipinleixingEntity> wrapper) {
		  Page<CaipinleixingView> page =new Query<CaipinleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<CaipinleixingView> selectListView(Wrapper<CaipinleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CaipinleixingView selectView(Wrapper<CaipinleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
