package gababo.sql;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class Passwordkey {
	
	private static String SECRET_KEY = "KEylengthhowbyte";  // 16바이트 이상이어야 하고 한글안됨

	public static String encryptPassword(String password) {

		
		try {
			SecretKeySpec secretKey = new SecretKeySpec(SECRET_KEY.getBytes(StandardCharsets.UTF_8), "AES");

			Cipher cipher = Cipher.getInstance("AES");

			cipher.init(Cipher.ENCRYPT_MODE, secretKey);

			byte[] encryptedBytes = cipher.doFinal(password.getBytes());

			return Base64.getEncoder().encodeToString(encryptedBytes);
		}

		catch (Exception e) {

			e.printStackTrace();

			return null;
		}
	}

	public static String decryptPassword(String encryptedPassword) {
		try {
			SecretKeySpec secretKey = new SecretKeySpec(SECRET_KEY.getBytes(StandardCharsets.UTF_8), "AES");

			Cipher cipher = Cipher.getInstance("AES");

			cipher.init(Cipher.DECRYPT_MODE, secretKey);

			byte[] decodedBytes = Base64.getDecoder().decode(encryptedPassword);

			byte[] decryptedBytes = cipher.doFinal(decodedBytes);

			return new String(decryptedBytes);
		}

		catch (Exception e) {

			e.printStackTrace();

			return null;
		}
	}
}