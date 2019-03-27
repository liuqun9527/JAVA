package IO;

import java.io.UnsupportedEncodingException;

public class EncodeDemo {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String s ="练习TEST";
		byte[] bytes1 = s.getBytes();//转换成字节序列用的是项目默认编码
		for(byte b : bytes1) {
			//把字节转换成int以16进制的方式显示
			System.out.print(Integer.toHexString(b & 0xff )+" ");
		}
		System.out.println();
		byte[] bytes2 = s.getBytes("utf-8");
		for(byte b : bytes2) {
			System.out.print(Integer.toHexString(b & 0xff )+" ");
		}
		
		System.out.println();
		byte[] bytes3 = s.getBytes("gbk");
		for(byte b : bytes3) {
			System.out.print(Integer.toHexString(b & 0xff )+" ");
		}
		
		//java是双字节编码utf-16be
		System.out.println();
		byte[] bytes4 = s.getBytes("utf-16be");
		for(byte b : bytes4) {
			System.out.print(Integer.toHexString(b & 0xff )+" ");
		}
	}

}
