/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connect;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author DUY
 */
public class Check_Validate {
   public static boolean isNumeric(String value ){
       Pattern pattern = Pattern.compile("\\d+");
       Matcher matcher = pattern.matcher(value);
       if (!matcher.find()) {
           return false;
       }
       return true;
   }
}
