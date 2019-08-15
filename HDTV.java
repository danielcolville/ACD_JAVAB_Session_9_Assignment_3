package session9;

public class HDTV {
	private String brandName;
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public int getInSize() {
		return inSize;
	}
	public void setInSize(int inSize) {
		this.inSize = inSize;
	}
	private int inSize;
	public HDTV(String brandName,int inSize) {
		this.brandName=brandName;
		this.inSize=inSize;
	}
}
