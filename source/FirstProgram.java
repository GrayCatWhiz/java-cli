public class FirstProgram {
    public static void main(String args[]){
        // javac *.java
        // jar -cvfm <name-of-jar-file.jar> <manifest-file> *.class
        SimpleUtils Messenger = new SimpleUtils();
        
        Messenger.getMessage();
        System.out.println(Messenger.getSum(1, 3));;
    }
}