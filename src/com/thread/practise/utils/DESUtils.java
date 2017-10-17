package com.thread.practise.utils;

import org.apache.commons.codec.binary.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.math.BigInteger;
import java.security.MessageDigest;

public class DESUtils {

	/**
	 * 加密方法
	 *
	 * @param encryptString
	 * @param encryptKey
	 * @return
	 */
	public static String encryptDES(String encryptString, String encryptKey) throws Exception {
		String afterEncryptString = "";
		try {
			SecretKeySpec key = new SecretKeySpec(encryptKey.getBytes(), "DES");
			Cipher cipher = Cipher.getInstance("DES");

			cipher.init(1, key);

			byte[] encryptedData = cipher.doFinal(encryptString.getBytes("UTF-8"));
			afterEncryptString = new Base64().encodeToString(encryptedData);
		} catch (Exception e) {
			throw e;
		}
		return afterEncryptString;
	}

	/**
	 * 解密方法
	 *
	 * @param decryptString
	 * @param decryptKey
	 * @return
	 */
	public static String decryptDES(String decryptString, String decryptKey) throws Exception {
		String afterDecryptString = null;
		byte[] byteMi = new Base64().decode(decryptString);
		try {
			SecretKeySpec key = new SecretKeySpec(decryptKey.getBytes(), "DES");
			Cipher cipher = Cipher.getInstance("DES");
			cipher.init(2, key);
			byte[] decryptData = cipher.doFinal(byteMi);
			afterDecryptString = new String(decryptData, "UTF-8");
		} catch (Exception e) {
			throw e;
		}
		return afterDecryptString;
	}

}
