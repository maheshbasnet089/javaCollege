public class AddValues{
    // data seeder constructor ma chalauxa mostly
    AddValues(){
        System.out.println("I am constructor");
    }
    public static void add(int i, int j){
        int result = i + j;
        System.out.println(result);
    }
    
     public static void add(int i, int j,int k ){
        int result = i + j + k;
        System.out.println(result);
    }
    public static void main(String[] args){
        System.out.println("Inside the main");
        AddValues c = new AddValues(); // creating an object
    }
}


    

 



