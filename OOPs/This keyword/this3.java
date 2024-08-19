public class this3 {
    String name;
    
    // setter method
    void setName(String name){
        this.name = name;
    }
     
    // getter method
    String getName(){
        return this.name;
    }

    public static void main(String[] args) {
        this3 t = new this3();

        // calling the setter and getter method
        t.setName("shahnawaz");
        System.out.println(t.getName());
    }
    
    
    
}
