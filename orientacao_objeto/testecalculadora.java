public class testecalculadora {
    public static void main(String[] args){
      System.out.println("A cois começa aqui");
      calculadora calc = new calculadora();
      int soma = calc.somar(7 , 8);
      soma = soma + calc.somar(2, 2);
      soma = soma + calc.somar(15, 17);
      System.out.println(soma);
      System.out.println("Até mais");
    }
}
