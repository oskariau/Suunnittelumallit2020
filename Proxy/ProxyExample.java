import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ProxyExample {
   /**
    * Test method
    */
   public static void main(final String[] arguments) {
	   Scanner scanner = new Scanner(System.in);
	    List<Image> phoneAlbum = new ArrayList<Image>();
        Image image1 = new ProxyImage("HiRes_10MB_Photo1");
        Image image2 = new ProxyImage("HiRes_10MB_Photo2");
        Image image3 = new ProxyImage("HiRes_10MB_Photo3");
        Image image4 = new ProxyImage("HiRes_10MB_Photo4");
        Image image5 = new ProxyImage("HiRes_10MB_Photo5");
        Image image6 = new ProxyImage("HiRes_10MB_Photo6");
        phoneAlbum.add(image1);
        phoneAlbum.add(image2);
        phoneAlbum.add(image3);
        phoneAlbum.add(image4);
        phoneAlbum.add(image5);
        phoneAlbum.add(image6);

        
        
        String command = "";
        int i = 0;
        System.out.println("Open phot album");
        phoneAlbum.get(i).showData();
        while (!command.contains("stop")) {
     
        	System.out.println("Options: next, back or stop?");
        	command = scanner.next();
        	if (command.contains("next")) {
        		if (i < phoneAlbum.size() - 1) {
        			i++;
        		}	else {
        			System.out.println("This is the last photo in album");
        		}
        	} else if(command.contains("back")) {
        		if (i > 0) {
        			i--;
        		}else {
        			System.out.println("This is the first photo in album");
        		}
        	}
        	
        	
        	if (!command.contains("stop")) {
        		phoneAlbum.get(i).showData();
        	}
        	
        }
    }
}
