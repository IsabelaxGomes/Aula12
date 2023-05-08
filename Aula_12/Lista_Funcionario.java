import java.util.ArrayList;

public class Lista_Funcionario <T extends Funcionario>  //Para a lista apenas guardar funcionarios

{

  
    //Atibutos 
     private  ArrayList<T> funcionarios; 



     //Metodos


     public void addFuncionario( T funcionario ){
        funcionarios.add(funcionario);
    }

    
    public void removerFuncionario(int indice){
        funcionarios.remove(indice);



    }


    public void listarFuncionarios (){
        for (int i = 0; i<funcionarios.size(); ++i){

            System.out.println("Funcionario do Mês" + i);

            funcionarios.get(i).listarDados();
        }
    }



    public Lista_Funcionario(){//construtor
        funcionarios = new ArrayList<T>();


    }











 }




