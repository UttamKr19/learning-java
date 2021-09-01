class A {
	public A() {
		System.out.println("Class A");
	}
}

class B extends A {
	public B() {
		System.out.println("Class B");
	}
}

class C extends B {
	public C() {
		System.out.println("Class C");
		
//		StringBuffer sb=new StringBuffer();
//		System.out.println(sb.capacity());
//		sb.append("ldsjdafasffdsflfx");
//		System.out.println(sb.capacity());
//		System.out.println(sb.hashCode());
//		System.out.println(sb.getClass());
//		
//		String s1="abc";
//		System.out.println(s1.hashCode());
//		String s2="abc";
//		System.out.println(s2.hashCode());
//		String s3=new String("abc");
//		System.out.println(s3.hashCode());
//		
//		System.out.println(s1==s2);
		
		
	}
}

public class MultilevelInheritance {
	public static void main(String[] args) {
		new C();
	}
}
