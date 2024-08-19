public class CallConstructor {
    
    String language;
    
    CallConstructor(){
        this.language = "java";
    }
    
    CallConstructor(String language){
        this.language = language;
    }
   
    public void getName(){
        System.out.println(this.language);
    }
   
    public static void main(String[] args) {
        CallConstructor cc = new CallConstructor();
        CallConstructor cc2 = new CallConstructor("python");
        
        cc.getName();
        cc2.getName();
        
    }
}
