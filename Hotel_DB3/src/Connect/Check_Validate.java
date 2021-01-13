/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.dmdmdm
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
       Pattern pattern = Pattern.compile("^[0-9]{1,20}$");
       Matcher matcher = pattern.matcher(value);
       if (!matcher.find()) {
           return false;
       }
       return true;
   }
   
   public static Boolean isPhone(String value){
       Pattern pattern = Pattern.compile("^[0][0-9]{9}$");
       Matcher matcher = pattern.matcher(value);
       if (!matcher.find()) {
           return false;
       }
       return true;
   }
   
   public static Boolean checkNV(String value){
       Pattern pattern = Pattern.compile("^[N][V][0-9]{3}$");
       Matcher matcher  = pattern.matcher(value);
       if (!matcher.find()) {
           return false;
       }
       return true;
   }
}
