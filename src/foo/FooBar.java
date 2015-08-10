package foo;

pubic class FooBar {
    private static class FooBarChild {
        private String name;
    }
    private static class FooBarChild2 {
        private int age;
    }
    public static void main(String[] args) {
        if (args.length < 1) {
            return;
        }
        System.out.println(args.length);
        System.out.println("FooBar");
    }
}
