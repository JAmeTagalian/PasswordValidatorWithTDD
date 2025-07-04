package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        
        // Test Case 1: รหัสผ่านสั้นควรจะ INVALID
        String pw="123";
        PasswordStrength result1 = PasswordValidator.validate(pw);
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 Passed: "+pw+" password is INVALID.");
        } else {
            System.out.println("Test Case 1 : "+pw+" : FAILED: Expected INVALID but got " + result1);
        }

        // Test Case 2  รหัสผ่านทั้งหมดเป็นตัวเล็กจะ WEAK
        pw="abcdefghij" ;
        PasswordStrength result2 = PasswordValidator.validate(pw);
        if (result2 == PasswordStrength.WEAK) {
            System.out.println("Test Case 2 : "+pw+" :Passed: password is WEAK.");
        } else {
            System.out.println("Test Case 1 : "+pw+" : FAILED: Expected WEAK but got " + result2);
        }

        // Test Case 3 รหัสผ่านมีทั้งตัวอักษรใหญ่เเละเล็ก 
        pw= "ABCDEfghi1";
        PasswordStrength result3 = PasswordValidator.validate(pw);
        if (result3 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 3 : "+pw+" :Passed: password is MEDIEM.");
        } else {
            System.out.println("Test Case 2 : "+pw+" :FAILED: Expected MEDIUM but got " + result3);
        }

        // Test Case 4 รหัสผ่านมีทั้งอักษรตัวใหญ่และตัวเล็กและตัวเลขและอักษรพิเศษ
        pw= "QWwertyu123-";
        PasswordStrength result4 = PasswordValidator.validate(pw);
        if (result4 == PasswordStrength.STRONG) {
            System.out.println("Test Case 4 : "+pw+" :Passed: password is STRONG.");
        } else {
            System.out.println("Test Case 3 : "+pw+ " :FAILED: Expected STRONG but got " + result4);
        }


        System.out.println("--------------------------------");
    }
}

