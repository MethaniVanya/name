package configs;

public class HelloWorld {
	private String message;
	public void setmessage(String message) {
		this.message=message;
	}
	public void getMessage() {
		System.out.println("yuour message :"+message);
	}
	public void showData() {
		System.out.println("this will show the string..");
	}

}
