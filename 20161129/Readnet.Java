public class Readnet{
	public static void main(String[] args){
		System.out.println("ALOHA!");
		string host;
	    string port;
		host =args[0];
		port =args[1];
       System.out.println("host:" + host);
       System.out.println("port:" + port);

   TRY{
        soch = new Socket( host,port);
        inStr = sock.getInputStream();
        Sytem.out.println("エラーです.");
        Sytem.exit(1);

 while(flag){
 	try{
 		int n=inStr.read(buff);
 		System.out.write(buff,0,n);
 	} catch(Exception e){
 		flag =false;
 	}
 }
 	
 	try{
 		inStr.close();
 	} catch(Exception e){
 		System.err.println("エラーです");
 		
 	}