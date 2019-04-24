package javaProgram;

public class Hello extends Sample{
	static int a=10;
	public static void add() {
		System.out.println("Add");
		System.out.println(a);
		System.out.println(b); //1st way(inheritance)
		System.out.println(Sample.b); //2nd way(Classname.variablename)
	}

	public static void main(String[] args) {
		add();
		sub(); //1st way(inheritance)
		Sample.sub(); //2nd way(Classname.methodname)
	}
}
