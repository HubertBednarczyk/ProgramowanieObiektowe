
class Main {
    public static int countChar(String str){
        int ileC = 0;
        for(int i =0;i<str.length();i++){
            char c = str.charAt(i);
            if(c=='c'){
                ileC+=1;
            }
        }
        return ileC;
    }

    public static int countSubStr(String str, String subStr){

    }

    public static void main(String[] args) {

        String inputString = "Hello@%&Worldccc!#123";
        System.out.println("Ilosc c w napisie: "+countChar(inputString));
    }
}