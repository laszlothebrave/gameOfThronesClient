import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

public class Test {

    public static void main(String[] args){
        System.out.println("Test Started");
        try {
            ProcessBuilder clientProcessBuilder = new ProcessBuilder("java", "-jar", "gameOfThronesClient\\out\\artifacts\\client\\client.jar");
            ProcessBuilder serverProcessBuilder = new ProcessBuilder("java", "-jar", "gameOfThronesServer\\out\\artifacts\\server\\server.jar");
            Path currentRelativePath = Paths.get("");
            Path parentPath = currentRelativePath.toAbsolutePath().getParent().getParent().getParent().getParent();
            clientProcessBuilder.directory(new File(parentPath.toString()));
            clientProcessBuilder.redirectOutput(ProcessBuilder.Redirect.PIPE);
            clientProcessBuilder.redirectInput(ProcessBuilder.Redirect.PIPE);
            clientProcessBuilder.redirectError(ProcessBuilder.Redirect.INHERIT);

            serverProcessBuilder.directory(new File(parentPath.toString()));
            serverProcessBuilder.redirectOutput(ProcessBuilder.Redirect.PIPE);
            serverProcessBuilder.redirectInput(ProcessBuilder.Redirect.PIPE);
            serverProcessBuilder.redirectError(ProcessBuilder.Redirect.INHERIT);
            Process clientProcess = clientProcessBuilder.start();
            Process serverProcess = serverProcessBuilder.start();
            TimeUnit.SECONDS.sleep(5);
            clientProcess.waitFor();
            serverProcess.waitFor();
        } catch (IOException e){
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Test Ended");
    }

}
