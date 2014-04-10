class Programa {

private void foo(Class<?> cls) {  //recebe como parametro um tipo classe.
    if (cls == String.class) { System.out.println("A classe é uma String"); }
    else { System.out.println("A classe não é uma String");  System.out.println(" e sim uma classe " + cls.getSimpleName() ); }
}  //getSimpleName() fornece o nome da classe em formato string, é aplicado a um tipo classe

private void bar() {
    foo(Programa.class);  // Programa.class é o tipo de classe (representação interna) correspondente a classe Programa.
}

  public static void main (String[] args){
    Programa a = new Programa();
    a.bar();
    }


}
