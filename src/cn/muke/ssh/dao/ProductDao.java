package cn.muke.ssh.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.muke.ssh.domain.Product;

public class ProductDao extends HibernateDaoSupport{
	public void save(Product product){
		System.out.println("Dao�е�save������ִ����");
		this.getHibernateTemplate().save(product);
	}
}
