public class Seguranca implements Funcionario{

    //Atributos
    float salario;
    String armamento; 






    //Metodos importados 

    @Override // Para o java garantir que não está comento um erro 
    public void listarDados(){

        System.out.println("Sou um segurança");


    }
    @Override   
    public void demissao(){

    }
    
    @Override
    public void reduzirSalario(){

    }

    @Override
    public float obterSalario(){
        return 0;


    }

    //Metodos dos seguranças

    public void mostarArmas(){


    }

    public void alterarArmas(){


    }

   
}
