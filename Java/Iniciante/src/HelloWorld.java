import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
public class HelloWorld {
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("Hello World!\n");
		bw.flush();
	}
}
