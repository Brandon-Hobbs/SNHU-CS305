package com.snhu.sslserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import java.security.MessageDigest;


@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}
}

@RestController
class ServerController{
//FIXME:  Add hash function to return the checksum value for the data string that should contain your name.    
	
	@GetMapping("/hash")
	public String greeting(@RequestParam(value = "name", defaultValue = "Brandon Hobbs") String name) throws Exception {
		//return String.format("Hello %s!", name);
		return myHash(name);
	}	
	
    //@RequestMapping("/hash")
    public String myHash(String data) throws Exception{
    	//String data = "Brandon Hobbs";
 	    	
    	//From https://www.tutorialspoint.com/java_cryptography/java_cryptography_message_digest.htm
    	//https://learning.oreilly.com/library/view/iron-clad-java/9780071835886/ch06.html#ch06lev2sec7
    	
    	MessageDigest md = MessageDigest.getInstance("SHA-256");
    	md.update(data.getBytes());
    	
    	byte[] digest = md.digest();
    	//System.out.println(digest);
    	
        //Converting the byte array in to HexString format
        StringBuffer hexString = new StringBuffer();
        
        for (int i = 0;i<digest.length;i++) {
           hexString.append(Integer.toHexString(0xFF & digest[i]));
        }
        //System.out.println("Hex format : " + hexString.toString());
        
        String returnString = String.format("<p>Hello %s!", data);
        returnString += "<p>data: This is your First and Last Name";
        returnString += "<p> SHA-265: CheckSum Value: ";
    	        
        return  returnString + hexString;
    }
}
