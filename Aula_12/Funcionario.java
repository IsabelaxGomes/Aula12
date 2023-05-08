public interface Funcionario{

    //interface - apenas assinaturas por isso implements
    //se funcionario fosse uma classe com metodos implementador extends 
     //Funcionario é uma  interface
    //Lista de funcionario está extendendo da classe Funcionario 


    public void listarDados();
         
    public void demissao();
    
    public void reduzirSalario();

    public float obterSalario();

    
}