class Counter {
    int number=10;

    void increment(){
        number=number+1;
    }
    public static void main(String[] args) {
        Counter obj1=new Counter();
        Counter obj2=new Counter();
        Counter obj3=new Counter();
        // Guess the number
        obj1.increment();
        obj2.increment();
        obj3.increment();
        System.out.println(obj1.number);
        System.out.println(obj2.number);
        System.out.println(obj3.number);
    }
}