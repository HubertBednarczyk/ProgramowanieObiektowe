
class Main {
    public static int countChar(String str, char c){
        int ileC = 0;
        for(int i =0;i<str.length();i++){
            if(str.charAt(i) == c){
                ileC += 1;
            }
        }
        return ileC;
    }

    public static int countSubStr(String str, String subStr){
        int len = subStr.length();
        int ilestr = 0;
        for(int i = 0;i<str.length()-len+1;i++){

        }
        return ilestr;
    }

    public static String middle(String str){

        return str.substring(2,3);
    }

    public static String repeat(String str, int n ){

    }

    public static void main(String[] args) {

        String inputString = "Hello@%&Worldcccc!#123";
        System.out.println("Ilosc c w napisie: "+countChar(inputString));

        String inputString2 = "HelloHelloHello2";
        String inputString3 = "HelleHello2";
        System.out.println("Ilosc napisu w napisie: "+countSubStr("HelloHelloHello2","Hello"));
        System.out.println(middle("Middle"));
    }
}