class This1{
    int barry;
    This1(int barry){
        this.barry = barry;
        System.out.println(this);
    }
    public static void main(String[] args) {
        This1 sc = new This1(10);
        System.out.println(sc);
    }
}