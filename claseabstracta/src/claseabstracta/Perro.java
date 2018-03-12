package claseabstracta;
public class Perro extends Animal {
    String emitirsonido(int  a) {
        return "Guau";
    }   
    @Override
    String emitirsonido() {    
        return "Guau";    
    }      
}
