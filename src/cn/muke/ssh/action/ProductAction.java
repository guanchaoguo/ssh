package cn.muke.ssh.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.muke.ssh.domain.Product;
import cn.muke.ssh.service.ProductService;

public class ProductAction extends ActionSupport implements ModelDriven<Product>{
	// ģ������Ҫʹ�õ��� 	
	private Product product = new Product();
	public Product getModel() {
		// TODO Auto-generated method stub
		return product;
	}
	
	// Struts��Spring���Ϲ����а������Զ�ע���ҵ�����	
	private ProductService productService;

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
	// ������Ʒִ�еķ���
	public String save(){
		System.out.println("Action�е�save������ִ����");
		productService.save(product);
		return NONE;
	}
	
}
