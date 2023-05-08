public class Cofre <T, K , J> {
    ///classe de tipos genericos 
    
    private T item;
    private K item2;
    private J item3;



    //Varivael item do tipo T

    public T retirarItem (){
        return item;
    }// um get escondido 

    public void guardarItem ( T item){
        this.item = item;
    }//void pq ele não faz nada 



    public K retirarItem2 (){
        return item2;
    }

    public void guardarItem2 ( K item2){
        this.item2 = item2;
    }



    public J retirarItem3 (){
       return item3;
    }

    
    public void guardarItem3 ( J  item3){
        this.item3 = item3;
    }



   
}