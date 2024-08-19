public class This4 {
    private int a, b;
    
    // constructor with two parameter
    private This4(int i, int j){
        this.a = i;
        this.b = j;
    }
    
    // constructor with single parameter
    private This4(int i){
        // invoke the constructor with two parameter
        this(i,i);
    }
    // constructor with no parameter
    private This4(){
      // invoke the constructor with single parameter
      this(0);  
    }

    @Override
    public String toString(){
        return this.a +" + " +this.b + "i";
    }

      
    public static void main(String[] args) {
        This4 t = new This4(2);
        This4 ts = new This4(3);
        System.out.println(t.a);
        System.out.println(ts.b);

    }

    }
    

