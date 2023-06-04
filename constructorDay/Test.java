public class Test{
     int i = 10 ;
    public void pupAge(Integer age){
        
     
        System.out.println(age);
    }
    public static void main(String[] args){
        Test newTest = new Test();
        System.out.println("The i value \t" + newTest.i);
        /*Test newTest = new Test();
        newTest.pupAge(10);*/
    }
} 