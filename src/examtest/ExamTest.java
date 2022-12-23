/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examtest;

/**
 *
 * @author hp
 */
public class ExamTest {

    /*If the input is from the user:
        AAVS => VS;
        ASD => SD;
        SDA => SDA;
    */
    public String truncate(String str){
     if(str.length()<=2){
         return str.replace("A", "");
     }   
     String first1 = str.substring(0, 2);
     String restStr = str.substring(2);
     return first1.replace("A", "") + restStr;
    }
    // (ABCD) => false; (AABCAA) => true; (AB) =>true; (A)=>fasle;
        public boolean sameFirstSameLast(String str){
            if(str.length()<=1){
              return false;
            }else if(str.length()== 2){
                return true;
        }
        String first2= str.substring(0, 2);
        String last2= str.substring(str.length()-2);
        return first2.equals (last2);
        }

}

