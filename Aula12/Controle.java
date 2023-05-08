public class Controle {




    public static void main(String[] args) {

        Cofre<String, String , String > c_s = new Cofre <String, String , String>();

        c_s.guardarItem("Bom dia");
        c_s.guardarItem2("Boa Tarde");
        c_s.guardarItem3("Boa Noite");

        Cofre<Integer, Float, Double> c_i = new Cofre <Integer, Float, Double>();
        c_i.guardarItem(100);
        c_i.guardarItem2(98.0f);
        c_i.guardarItem3(98.0);


        System.out.println(
        
         c_s.retirarItem());

        System.out.println(
        
         c_s.retirarItem2());

         System.out.println(
        
         c_s.retirarItem3());

    



        System.out.println(
        
            c_i.retirarItem());

        System.out.println(
            c_i.retirarItem2());
        
        System.out.println(
            c_i.retirarItem3()
        );
        
        
    }
    
}
