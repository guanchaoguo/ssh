package cn.muke.ssh.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.muke.ssh.domain.Product;
import cn.muke.ssh.service.ProductService;

public class ProductAction extends ActionSupport implements ModelDriven<Product>{
	// 模型驱动要使用的类 	
	private Product product = new Product();
	public Product getModel() {
		// TODO Auto-generated method stub
		return product;
	}
	
	// Struts和Spring整合过程中按名称自动注入的业务层类	
	private ProductService productService;

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
	// 保存商品执行的方法
	public String save(){
		System.out.println("Action中的save方法被执行了");
		productService.save(product);
		return NONE;
	}
	
}
