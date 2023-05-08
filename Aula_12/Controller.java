public class Controller {


    public static void main(String[] args) {
        
        Lista_Funcionario <Funcionario> lista = new Lista_Funcionario <Funcionario>();


        Seguranca s = new Seguranca();
        lista.addFuncionario(s);



         Professor p = new Professor();
         lista.addFuncionario(p);
         

         lista.listarFuncionarios();







    }
    
}
