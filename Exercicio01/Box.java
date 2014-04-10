public class Box<T> {

  private T t;

  public void add(T t) {
    this.t = t;
  }

  public T get() {
    return t;
  }

  public static void main(String[] args) {
     Box<Integer> integerBox = new Box<Integer>();  //Cria um tipo Box de inteiros.
     Box<String> stringBox = new Box<String>();   //Cria um tipo Box de Strings.
    
     integerBox.add(new Integer(10));   Cria um tipo inteiro 10 e passa a referencia para integerBox
     stringBox.add(new String("Hello World"));  Cria um tipo String e passa a referencia para stringBox

     System.out.printf("Integer Value :%d\n\n", integerBox.get());  //Passa a referencia do inteiro 10 criado
     System.out.printf("String Value :%s\n", stringBox.get());  //Passa a referencia da string criada.
  }
}
