package foo;

pubic class FooBar {
    private static class FooBarChild {
        private String name;
        public String getName() {
            return name;
        }
        public void setName(String name) {
           this.name = name;
        }
    }
    public static void main(String[] args) {
        if (args.length < 1) {
            return;
        }
        System.out.println(args.length);
        System.out.println("FooBar");
    }
}
