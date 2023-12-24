public class Pessoa {
    String nome;
    String sexo;
    int idade;

    public void aptaVotar(){
        if(idade<16){
            System.out.println("Não está apta a votar");
        }
        else if(idade>=16 && idade<=17 && idade>70){
            System.out.println("Apta a votar, voto facultativo");
        }
        else{
            System.out.println("Apta a votar, voto obrigatório");
        }
    }
}
