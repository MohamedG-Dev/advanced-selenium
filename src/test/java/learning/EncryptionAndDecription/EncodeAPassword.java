package learning.EncryptionAndDecription;

import java.util.Base64;

public class EncodeAPassword {

	public static void main(String[] args) {
		String password = "rkiran";
		byte[] passwordBytes = password.getBytes();
		String encodedPassword = Base64.getEncoder().encodeToString(passwordBytes);
		System.out.println(encodedPassword);

	}

}
