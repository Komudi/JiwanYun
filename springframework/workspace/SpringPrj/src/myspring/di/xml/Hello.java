package myspring.di.xml;

public class Hello {
	private String name;
	private Printer printer;
	
    public void setName(String name) {
		this.name = name;
	}
    // setname �Է� �� ctrl + space ������ setName �޼ҵ尡 �ڵ����� �������
    
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