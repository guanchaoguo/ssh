package cn.muke.ssh.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.muke.ssh.domain.Product;

public class ProductDao extends HibernateDaoSupport{
	public void save(Product product){
		System.out.println("Dao中的save方法被执行了");
		this.getHibernateTemplate().save(product);
	}
}
