package net.mingsoft.mall.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mingsoft.base.biz.impl.BaseBizImpl;
import com.mingsoft.base.dao.IBaseDao;
import com.mingsoft.basic.dao.IModelDao;

import net.mingsoft.mall.biz.IProductSpecificationDetailBiz;
import net.mingsoft.mall.dao.IProductSpecificationDetailDao;
import net.mingsoft.mall.entity.ProductSpecificationDetailEntity;


/**
 * 
 * 
 * <p>
 * <b>铭飞MS平台</b>
 * </p>
 * 
 * <p>
 * Copyright: Copyright (c) 2014 - 2015
 * </p>
 * 
 * <p>
 * Company:景德镇铭飞科技有限公司
 * </p>
 * 
 * @author 王敏
 * 
 * @version 300-001-001
 * 
 *          <p>
 *          版权所有 铭飞科技
 *          </p>
 * 
 *          <p>
 *          Comments:商品规格库存业务处理层实现类 || 继承BaseBizImpl业务处理层||实现IProductSpecificationsInventoryBiz业务层接口
 *          </p>
 * 
 *          <p>
 *          Create Date:2014-7-14
 *          </p>
 * 
 *          <p>
 *          Modification history:
 *          </p>
 */
@Service("ProductSpecificationDetailBizImpl")
public class ProductSpecificationDetailBizImpl extends BaseBizImpl implements IProductSpecificationDetailBiz{
	
	/**
	 * 产品库存数据处理层
	 */
	@Autowired
	private IProductSpecificationDetailDao detailDao;
	
	/**
	 * 根据产品ID 删除产品信息
	 * @param productIds 产品ID数组
	 */
	@Override
	public void deleteByProductIds(int[] productIds){
		this.detailDao.deleteEntityByProductIds(productIds);
	}

	@Override
	protected IBaseDao getDao() {
		return detailDao;
	}
}
