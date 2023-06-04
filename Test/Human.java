public class Human{
    private final String name; 
    
    // constructor
    public Human(String name){
        this.name = name;
        System.out.println("From inside human" + name);
        System.out.println("Hello i m inside human");
    }
    
    public static void main(String[] args){
        Human human = new Human("Mahesh");
        add();
        
    }
    public static void add(){
        int i = 10;
        int j = 20;
        int result = i + j ;
        System.out.println(result);
    }
}