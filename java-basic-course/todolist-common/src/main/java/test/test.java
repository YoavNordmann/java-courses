package test;

public class test {
	
	String template = "Hello %s";
	
	int member;
	String name;
	
	@Override
	public String toString() {
		return String.format(template, "World");
	}


}
