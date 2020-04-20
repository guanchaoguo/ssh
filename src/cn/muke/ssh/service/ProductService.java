package cn.muke.ssh.service;

import org.springframework.transaction.annotation.Transactional;

import cn.muke.ssh.dao.ProductDao;
import cn.muke.ssh.domain.Product;

@Transactional
public class ProductService {
	// 业务层注入Dao的类	
	private ProductDao productDao;

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
	
	public void save(Product product){
		System.out.println("Service中的save方法被执行了");
		productDao.save(product);
	}
}
