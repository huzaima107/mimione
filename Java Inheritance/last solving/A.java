public class A{

public void foo (object o) {

System.out.println("Monday");

}
}
 class B{

public void foo (String o) {

System.out.println("Tuesday");
}
}

 class C extends A{
    public void foo (String s) {

System.out.println("Wednesday");

}
}

 class D extends B{

public void foo (Object o) {

System.out.println("Friday");
}
}

 class Main {

public static void main(String[] args) {

  A a = new C(); 
//   a.foo("Java");



//   C c = new C();
//   c.foo("Java");
//   b.foo("Java");
//   B b = new D();
//   b.foo("Java");
//   D d = new D();

d.foo("java");
}
}