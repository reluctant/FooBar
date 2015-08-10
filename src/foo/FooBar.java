package foo;

pubic class FooBar {
    public static void main(String[] args) {
        if (args.length < 1) {
            return;
        }
        System.out.println(args.length);
        System.out.println("FooBar");
    }
}
