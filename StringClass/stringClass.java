class StringClass {
    public static void main(String[] args) {
        String test = "HelloWorld";
        System.out.println(test.length());
        System.out.println(test.charAt(0));
        System.out.println(test.substring(2, 5)); // index 2 ko included but 5 ko not included
        String s1 = "Hello";
        String s2 = "World";
        String output = s1.concat(s2);
        System.out.println(output);

    }
}