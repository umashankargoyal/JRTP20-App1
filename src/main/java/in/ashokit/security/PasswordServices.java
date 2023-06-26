package in.ashokit.security;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class PasswordServices {
	public static String encode(String txt) {
		Encoder encoder = Base64.getEncoder();
		return encoder.encodeToString(txt.getBytes());
		}
	
	public static String decode(String encodeTxt) {
		Decoder decoder = Base64.getDecoder();
		byte[] decode = decoder.decode(encodeTxt);
		return new String (decode);
	}
	
	public static void main(String[] args) {
		String encode = PasswordServices.encode("Ashok it");
		System.out.println(encode);
		String decode = PasswordServices.decode(encode);
		System.out.println(decode);
	}

}
