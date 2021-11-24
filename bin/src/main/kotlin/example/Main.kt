package example;

import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.BadPaddingException;
import javax.crypto.spec.IvParameterSpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

@Throws(Exception::class)
fun main(args: Array<String>) {

  val plainText = "Hello World";
  val password = "@amG89>";
  val salt = AESUtils.generateSalt(256);
  val ivParameterSpec = AESUtils.generateIv();

  val key = AESUtils.getKeyFromPassword(password,salt);
  val cipherText = AESUtils.encryptPasswordBased(plainText, key, ivParameterSpec);
  val decryptedCipherText = AESUtils.decryptPasswordBased(cipherText, key, ivParameterSpec);

  println("Original: " + plainText);
  println("Password: " + password);
  println("Salt: " + salt);
  println("Encrypt: " + cipherText);
  println("Decrypt: " + decryptedCipherText);

}
