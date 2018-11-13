package mvc.model;

public class Product {
	
	String id,name;
	Integer cnt;
	Integer price;
	
	
	public Product() {
		System.out.println("Product()생성자");

	}
	
	public Integer getTotal() {
		return cnt*price;
	}

	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCnt() {
		return cnt;
	}
	public void setCnt(Integer cnt) {
		this.cnt = cnt;
	}
	
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", cnt=" + cnt + ", price=" + price + "]";
	}
	
	
}
