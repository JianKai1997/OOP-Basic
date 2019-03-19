package object;

public class Object {

    public static void main(String[] args) {
        Class c = new Class(100);
        System.out.println(c.sum());
        
        Class a = new Class();
        System.out.println(a.sum());
        
        Class b = new Class(50,100);
        System.out.println(b.change(b));
        
        Class d = new Class(10,20,30);
        System.out.println(d.Anotherchange(d));
  
    }
    
}
