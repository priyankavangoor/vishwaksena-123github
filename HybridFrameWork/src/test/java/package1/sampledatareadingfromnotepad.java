package package1;

import java.io.IOException;

import com.vtiger.genericutilities.propertyfileutility;

public class sampledatareadingfromnotepad {

	public static void main(String[] args) throws IOException {
		
		propertyfileutility p = new propertyfileutility();
		System.out.println(p.readdatafrompropertyfile("url"));
	}
}

