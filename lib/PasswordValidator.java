package lib;

public class PasswordValidator {

    /**
     * คุณจะต้องเขียน Javadoc ที่สมบูรณ์ที่นี่ในอนาคต
     * เพื่ออธิบายกฎการทำงานของเมธอด
     * @return 
     */
    // TODO: แก้ไข return type ของเมธอดนี้ให้ถูกต้อง
    public static PasswordStrength validate(String password) { // Function Type ให้เป็น PasswordStrength 
        
        // ส่วนของ Implementation ที่คุณต้องเขียน
        // ...
        if (password == null || password.length()<8) 
            return PasswordStrength.INVALID;

            
        boolean lowerletter = false;
        boolean Upperletter = false;
        boolean Digits = false;
        boolean Special = false;

       
        for (char c : password.toCharArray()){
            if (Character.isLowerCase(c)) {
               lowerletter = true;
            } else if (Character.isUpperCase(c)) {
                Upperletter = true ;
            } else if (Character.isDigit(c)) {
                Digits = true;
            } else 
            Special = true ;
        }

        int count = 0 ;
        if (lowerletter) { count++; }
        if (Upperletter) { count++; }
        if (Digits) { count++; }
        if (Special) { count++; }

        if (count == 4) { 
            return PasswordStrength.STRONG; 
        }
        else if (count == 3) {
            return PasswordStrength.MEDIUM;
        } else {
            return PasswordStrength.WEAK;
        }
        
    }
}