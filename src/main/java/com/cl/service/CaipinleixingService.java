package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.CaipinleixingEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.CaipinleixingView;


/**
 * 菜品类型
 *
 * @author 
 * @email 
 * @date 2024-03-07 15:04:15
 */
public interface CaipinleixingService extends IService<CaipinleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CaipinleixingView> selectListView(Wrapper<CaipinleixingEntity> wrapper);
   	
   	CaipinleixingView selectView(@Param("ew") Wrapper<CaipinleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CaipinleixingEntity> wrapper);
   	

}

