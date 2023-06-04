public class LearningThis{
     LearningThis(){
        
        this(10);
        System.out.println("inside firstLearningThis");
    }
     LearningThis(int id){
        System.out.println(id);
        ;
    }
    
    public static void main(String[] args){
        System.out.println("Inside the main method");
        LearningThis newTest = new LearningThis();
        
    }
}