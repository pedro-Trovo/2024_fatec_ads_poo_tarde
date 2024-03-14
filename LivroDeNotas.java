public class LivroDeNotas{
    //variavel de instancia(objeto)
    private String nomeDaDisciplina;
    LivroDeNotas(String nomeDaDisciplina){
        this.nomeDaDisciplina = nomeDaDisciplina;
    }
    public void exibirMensagem( ){
        System.out.printf("Bem vindo ao lvro de notas %s", this.nomeDaDisciplina);
    }

    // public void setNomeDaDisciplina(String n){
    //     if(nomeDaDisciplina.length() >= 3)
    //     nomeDaDisciplina = n;
    //}

    public String getNomeDaDisciplina(){
        return this.nomeDaDisciplina;
    }
}












//byte, short, int, long, float, double, boolean, char