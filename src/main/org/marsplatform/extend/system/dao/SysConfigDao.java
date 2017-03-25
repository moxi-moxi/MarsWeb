package org.marsplatform.extend.system.dao;

import org.apache.ibatis.annotations.Param;
import org.marsplatform.core.common.dao.BaseDao;
import org.marsplatform.extend.system.model.SysConfigEntity;

/**
 * 系统配置信息
 * 
 */
public interface SysConfigDao extends BaseDao<SysConfigEntity> {
	
	/**
	 * 根据key，查询value
	 */
	String queryByKey(String paramKey);
	
	/**
	 * 根据key，更新value
	 */
	int updateValueByKey(@Param("key") String key, @Param("value") String value);
	
}
