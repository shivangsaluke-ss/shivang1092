class Addition {
    // Function with arguments and no return value
    int add(int a,int b) 
    {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Addition obj = new Addition();

        // Passing fixed arguments
        // print value 
        
        obj.add(10, 20);
        System.out.println(obj.add(50, 70));
    }
}