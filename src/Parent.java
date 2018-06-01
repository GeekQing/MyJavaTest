
public class Parent {
	
	protected boolean isOpen;
	
	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	
	protected void print() {
		System.out.println("Parent : " + isOpen());
	}

}
