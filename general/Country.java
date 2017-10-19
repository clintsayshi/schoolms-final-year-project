/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general;

import java.util.Locale;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author mcclint
 */
public class Country {
        static String[] locales = Locale.getISOCountries();
        //String a[] = Locale.
    
    public static ObservableList<String> getCountries(){
        String[] Countries = new String[locales.length];
        for (int a = 0; a < locales.length; a++) {
		Locale obj = new Locale("", locales[a]);
                Countries[a] = obj.getDisplayCountry();
                //System.out.println( obj.getDisplayCountry()+ " " + locales[a]);
	}
        return FXCollections.observableArrayList(Countries);
    }
    
    public static String getCountryCode(int n){
        String c = locales[n];
        return c;
    }
    
    
}
