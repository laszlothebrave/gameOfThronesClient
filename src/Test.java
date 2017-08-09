import java.io.File;
import java.io.IOException;

public class Test {

    public static void main(String[] args){
        System.out.println("Test Started");
        try {
            ProcessBuilder pb = new ProcessBuilder("java", "-jar", "superior.jar");
            pb.directory(new File("C:\\Users\\laszlothebrave\\IdeaProjects\\gameOfThronesClient\\out\\artifacts\\superior"));
            pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);
            pb.redirectError(ProcessBuilder.Redirect.INHERIT);
            Process proces = pb.start();
            proces.waitFor();
        } catch (IOException e){
            System.out.println("Process exeption");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Test Ended");
    }
}
