class MyClass {

    static void display() {
        System.out.println("This is a static display method");
    }

    public static void main(String[] args) {
        // Calling static method without creating object
        MyClass.display();
    }
}
