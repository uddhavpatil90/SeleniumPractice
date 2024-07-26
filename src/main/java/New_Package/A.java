package New_Package;

class A {

	int i = 10;

}

class B extends A {

	int i = 20;

	public static void main(String[] args) {

		A obj = new B();
		System.out.println(obj.i);

	}

}