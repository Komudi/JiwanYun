package myspring.di.xml;

public class Hello {
	private String name;
	private Printer printer;
	
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