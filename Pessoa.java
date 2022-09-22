public class Pessoa {
    private String nome;
            int idade;
    private String cpf;
    Pessoa(String nome,int idade,String cpf){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }
    public String getNome(){
        return this.nome;
    
    }
    public int getIdade(){
        return this.idade;
    }
  
    public String getCPF(){
    return this.cpf;

}
}
