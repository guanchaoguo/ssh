package cn.muke.ssh.service;

import org.springframework.transaction.annotation.Transactional;

import cn.muke.ssh.dao.ProductDao;
import cn.muke.ssh.domain.Product;

@Transactional
public class ProductService {
	// ҵ���ע��Dao����	
	private ProductDao productDao;

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
	
	public void save(Product product){
		System.out.println("Service�е�save������ִ����");
		productDao.save(product);
	}
}
