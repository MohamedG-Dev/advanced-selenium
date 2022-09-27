package learning.EncryptionAndDecription;

import java.util.Base64;

public class DecodeAText {

	public static void main(String[] args) {
		String encryptedText = "cmtpcmFu";

		byte[] decodedbyteText = Base64.getDecoder().decode(encryptedText);
		String decodedText = new String(decodedbyteText);
		System.out.println(decodedText);

	}

}
