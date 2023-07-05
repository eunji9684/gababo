package gababo.sql;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Passwordkey {

	private static String SECRET_KEY = "KEylenggthhowbyteengthhowbytedss";  
	
	private final static String iv = SECRET_KEY.substring(0, 16);
	public static String encryptPassword(String password) {

		
		try {
			
	        SecretKeySpec secretKey = new SecretKeySpec(SECRET_KEY.getBytes(StandardCharsets.UTF_8), "AES");
	        
	        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding"); // AES/CBC/PKCS5Padding을 사용
	        
	        IvParameterSpec ivParamSpec = new IvParameterSpec(iv.getBytes());

	        cipher.init(Cipher.ENCRYPT_MODE, secretKey, ivParamSpec);

	        byte[] encryptedBytes = cipher.doFinal(password.getBytes());

	        System.out.println(encryptedBytes.length);
	        
	        return Base64.getEncoder().encodeToString(encryptedBytes);
			
			/*
			SecretKeySpec secretKey = new SecretKeySpec(SECRET_KEY.getBytes(StandardCharsets.UTF_8), "AES");
			 
			System.out.println(secretKey);
			
			Cipher cipher = Cipher.getInstance("AES");
			
			System.out.println(cipher.getBlockSize());
			
			IvParameterSpec ivParamSpec = new IvParameterSpec(iv.getBytes());

			System.out.println(ivParamSpec);

			cipher.init(Cipher.ENCRYPT_MODE, secretKey);
			
			System.out.println(ivParamSpec);
		
			byte[] encryptedBytes = cipher.doFinal(password.getBytes());
			
			System.out.println(encryptedBytes.length);
			
			System.out.println(Base64.getEncoder().encodeToString(encryptedBytes));
	
			return Base64.getEncoder().encodeToString(encryptedBytes);
			
			*/
				
		}
		
		
		
		catch (Exception e) {

			return null;
		}
	}

	public static String decryptPassword(String encryptedPassword) {
		try {
			SecretKeySpec secretKey = new SecretKeySpec(SECRET_KEY.getBytes(StandardCharsets.UTF_8), "AES");

			Cipher cipher = Cipher.getInstance("AES");
			
			IvParameterSpec ivParamSpec = new IvParameterSpec(iv.getBytes());

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