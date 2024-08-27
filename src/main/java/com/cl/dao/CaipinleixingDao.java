package com.cl.dao;

import com.cl.entity.CaipinleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.CaipinleixingView;


/**
 * 菜品类型
 * 
 * @author 
 * @email 
 * @date 2024-03-07 15:04:15
 */
public interface CaipinleixingDao extends BaseMapper<CaipinleixingEntity> {
	
	List<CaipinleixingView> selectListView(@Param("ew") Wrapper<CaipinleixingEntity> wrapper);

	List<CaipinleixingView> selectListView(Pagination page,@Param("ew") Wrapper<CaipinleixingEntity> wrapper);
	
	CaipinleixingView selectView(@Param("ew") Wrapper<CaipinleixingEntity> wrapper);
	

}
