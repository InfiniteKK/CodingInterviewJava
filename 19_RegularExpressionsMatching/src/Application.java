public class Application {
    public static void main(String[] args) {
//        StringBuilder string = new StringBuilder("aaa");
//        StringBuilder pattern = new StringBuilder("a.a");
//        StringBuilder pattern = new StringBuilder("a*ab");
//        StringBuilder pattern = new StringBuilder("a*");

        StringBuilder string = new StringBuilder("b");
        StringBuilder pattern = new StringBuilder("a*b");
//        StringBuilder pattern = new StringBuilder("b*b*b*");

        MatchDemo demo = new MatchDemo();
        if(demo.match(string,pattern)){
            System.out.println(string + " -> " + pattern+" MATCH!");
        }else {
            System.out.println(string + " -> " + pattern+" NOT MATCH!");
        }
    }
}
