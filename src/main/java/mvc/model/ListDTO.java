package mvc.model;

import java.util.ArrayList;

import org.apache.ibatis.type.Alias;

@Alias("listDTO")
public class ListDTO {

	ArrayList<BoardDTO> mem;
	
	public ArrayList<BoardDTO> getMem() {
		return mem;
	}
	public void setMem(ArrayList<BoardDTO> mem) {
		this.mem = mem;
	}
	
	
	@Override
	public String toString() {
		return "ListDTO [mem=" + mem + "]";
	}
	
}
