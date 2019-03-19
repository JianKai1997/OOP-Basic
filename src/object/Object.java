package object;

public class Object {

    public static void main(String[] args) {
        Class a,b,c,d;
        
        c = new Class(100);
        System.out.println(c.sum());
        
        a = new Class();
        System.out.println(a.sum());
        
        b = new Class(50,100);
        System.out.println(b.change(b));
        
        d = new Class(10,20,30);
        System.out.println(d.Anotherchange(d));
  
    }
    
}
