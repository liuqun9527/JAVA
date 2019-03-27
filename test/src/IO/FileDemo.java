package IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		//了解构造函数
		
		
		//File file = new File("C:\\Users\\飞奔的二块五\\Desktop");
		//判断文件或目录是否存在
		//System.out.println(file.exists());
		
		//判断是否是目录,如不是目录或目录不存在则直接创建目录
		//System.out.println(file.isDirectory());
		
		URL url = new URL("http://www.baidu.com");

	    /* 字节流 */
	    InputStream is = url.openStream();

	    /* 字符流 */
	    InputStreamReader isr = new InputStreamReader(is, "utf-8");

	    /* 提供缓存功能 */
	    BufferedReader br = new BufferedReader(isr);

	    String line;
	    while ((line = br.readLine()) != null) {
	        System.out.println(line);
	    }

	    br.close();
	}

}
