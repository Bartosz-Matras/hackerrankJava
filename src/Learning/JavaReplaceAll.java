package Learning;

public class JavaReplaceAll {
    public static void main(String[] args) {
        String s1 = "javatpoint is a very good website";
        String replaceString1 = s1.replaceAll("a", "e");
        System.out.println(replaceString1);

        String s2 = "My name is Khan. My name is Bob. My name is Sonoo.";
        String replaceString2 = s2.replaceAll("is", "was");
        System.out.println(replaceString2);

        String s3 = "My name is Khan. My name is Bob. My name is Sonoo.";
        String replaceString3 = s3.replaceAll("\\s", "");
        System.out.println(replaceString3);

        String s4 = "My name is Khan. My name is Bob. My name is Sonoo.";
        String replaceString4 = s4.replaceAll("\\s+", "");
        System.out.println(replaceString4);
    }
}
