package mvc.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ByOrder {
	
	List<Product> proList;
	Address addr;
	int totalll;

	
	public int getTotalll() {
		return totalll;
	}

	public List<Product> getProList() {
		return proList;
	}
	public void setProList(List<Product> proList) {
		this.proList = proList;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
	
	public void execute() {
		totalll = 0; 
		//for(int i =0;i<=proList.size()-1;i++) {
			for(int i =proList.size()-1 ;i<=0;i--) {
			Product pro = proList.get(i);
			System.out.println(pro);
			if(pro.getId().equals("") 
				|| pro.getId().equals("null") 
				|| pro.getId()==null) {
				proList.remove(pro);
			}else {
				totalll += pro.getTotal();
			}
		}
		
	}
	
	@Override
	public String toString() {
		return "ByOrder [proList=" + proList + ", addr=" + addr + "]";
	}
	
	

}
