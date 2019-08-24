public class Application {
    public static void main(String[] args) {
//        String string = "";
//        String string = " ";
//        String string = "We  are  happy.";
        String string = "We are happy.";
        StringBuilder stringBuilder = new StringBuilder(string);
        ReplaceBlankDemo demo = new ReplaceBlankDemo();
        demo.replaceBlank(stringBuilder);
    }
}
