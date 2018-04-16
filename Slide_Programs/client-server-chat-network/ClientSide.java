import java.io.*;
import java.net.*;

public class ClientSide {

 public static void main(String[] args) {

  if (args.length != 3) {
   System.out.println("CIS 5850 Example");
   System.out.println("Usage: java ClientSide Hostname port message");
   System.exit(0);
  }

  String serverName = args[0]; // either ASCII or numeric form is OK
  int serverPort = Integer.parseInt(args[1]);
  String message = args[2];

  try {
   Socket s = new Socket(serverName, serverPort); //wait for server to accept
   DataOutputStream dos = new DataOutputStream(s.getOutputStream());
   dos.writeUTF(message);
   dos.close(); // and flush
  } catch (Exception e) {
   System.out.println(e);
  }

 }
 
}