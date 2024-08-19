class InstanceOf1{
    public static void main(String[] args) {
        String name  = "java";

        // check if name instance of String
        boolean result = name instanceof String;
        System.out.println("yes, name is an instance of strins"+result);

        // create an object of main method
        InstanceOf1 io = new InstanceOf1();

        // check if obj is an instance of Instanceof1
        boolean result1 = io instanceof InstanceOf1;
        System.out.println(" obj of an instance = " +result1);
    }


}