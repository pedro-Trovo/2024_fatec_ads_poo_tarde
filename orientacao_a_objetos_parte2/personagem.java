public class Personagem{
     //variaveis de instancia
     String nome;
     int energia;
     int fome;
     int sono;

     void cacar(){
          System.out.printf("%s esta cascando...\n", nome);
     }

     void comer(){
          System.out.printf("%s esta comendo. . .\n", nome);
     }
     void dormir(){
          System.out.printf("%s esta dormindo");
     }
}