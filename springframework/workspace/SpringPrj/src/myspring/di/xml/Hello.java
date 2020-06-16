package myspring.di.xml;

import java.util.List;

public class Hello {
	private String name;
	private Printer printer;
	private List<String> names;
	
	public Hello() {}
	
    public Hello(String name, Printer printer) {
		super();
		this.name = name;
		this.printer = printer;
	}
    
	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	public void setName(String name) {
		this.name = name;
	}
    // setname 입력 후 ctrl + space 누르면 setName 메소드가 자동으로 만들어짐
    
    public void setPrinter(Printer printer) {
		this.printer = printer;
	}
    
    public String sayHello() {
    	return "Hello " + name;
    }
    
    public void print() {
    	this.printer.print(sayHello());
    }
}