/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listfull;

/**
 *
 * @author Trupti
 */
import java.util.ArrayList;
import java.util.List;

public class ListFull {

	public static void main(String[] args) {

		List<String> strList = new ArrayList<String>();
		
		int counter = 0;
		boolean flag = true;
		while(flag) {
			
			String value = "This is a leaky String "+counter++;
			
			strList.add(value);
			
		}
		
		
		System.out.println(strList.size());
		

	}

}