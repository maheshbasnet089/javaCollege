
class StringClass {
    public static void main(String[] args) {
        String test = "HelloWorld";
        System.out.println(test.length());
        System.out.println(test.charAt(1));
        System.out.println(test.substring(3));
        System.out.println(test.substring(2, 5)); // index 2 ko included but 5 ko not included
        String s1 = "Hello";
        String s2 = "World";
        String output = s1.concat(s2);
        System.out.println(output);

        String projectName = "Digital PathShala";
        int projectOutput = projectName.indexOf("gital");
        System.out.println(projectOutput);
        System.out.println(projectName.indexOf("gi", 3)); // 3 index vanda paxadi ko matra khojna kaam garxa

        Boolean resultBool = test.equals(projectName);
        System.out.println(resultBool);

        Boolean isEqualsByIgnoring = test.equalsIgnoreCase(test);
        System.out.println(isEqualsByIgnoring);

    }
}