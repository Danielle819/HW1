public class Assignment01Q01 {
    public static void main(String[] args) {
        for(String str: args){
            char c = str.charAt(0);
            if((int)c % 5 == 0)
                System.err.println(c);
        }
    }
}
