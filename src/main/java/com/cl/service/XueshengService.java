package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.XueshengEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.XueshengView;


/**
 * 学生
 *
 * @author 
 * @email 
 * @date 2024-03-07 15:04:15
 */
public interface XueshengService extends IService<XueshengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengView> selectListView(Wrapper<XueshengEntity> wrapper);
   	
   	XueshengView selectView(@Param("ew") Wrapper<XueshengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengEntity> wrapper);
   	

}

