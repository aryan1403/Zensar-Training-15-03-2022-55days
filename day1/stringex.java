public class stringex {
    public static void main(String[] args) {
        String s = "Aaryan is a cat";
            //      012345

        System.out.println(s.length()); // 6
        System.out.println(s.charAt(3)); // y
        System.out.println(s.substring(2, s.length())); // ryan
        // beginIndex - Including, lastIndex - Excluded
        String[] arr = s.split(" ");
        System.out.println(s.equals("Aaryan is a cat"));
        System.out.println(s.concat(" and human"));
        System.out.println(s.indexOf("a")); // first occurence
        System.out.println(s.lastIndexOf("a")); // last occurence
        System.out.println(s.contains("dog")); 
        System.out.println(s.startsWith("Aa"));
        System.out.println(s.endsWith("cat"));
        System.out.println(s.equalsIgnoreCase("aaryan is a cat"));

        System.out.println(s.replace("cat", "human"));

        int counter = 0; // record of how many times it occurs
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'c') { // if you find a increment the counter
                counter++;
            }
        }
        System.out.println("a occured = " + counter + " times");

        System.out.println(arr[3]);
    }
}
