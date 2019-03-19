package object;

public class Class {
    
    int x,y,z;

    Class(){
        x=1;
        y=1+x;
    }
    
    Class(int a){
        x = a;
        y = 1;
    }
    
    Class(int a,int b){
    }
    
    int change(Class aP){
        aP.x = 100;
        aP.y = 100;
        return sum(); 
    }
    
    int sum(){
        return x+y;
    }
    
    
    Class(int a,int b,int c){
        x=a;
        y=b;
        z=c;
    }
    
    int Anotherchange(Class aP){
        return sum2(); 
    }
    
    int sum2(){
        return x+y+z;
    }
    
}
