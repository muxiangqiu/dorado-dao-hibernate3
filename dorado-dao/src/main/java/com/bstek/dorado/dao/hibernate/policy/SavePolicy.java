package com.bstek.dorado.dao.hibernate.policy;


/**
 *@author Kevin.yang
 *@since 2015年5月17日
 */
public interface SavePolicy {

	 void apply(SaveContext context);
}
