class Test{
    private String name;
    Test(){

        System.out.println("that is called constructor");
        name = "Shahnawaz";
    }
    public static void main(String[] args) {
        Test sc = new Test();
        System.out.println(" i like it "+ sc.name);
    }
}