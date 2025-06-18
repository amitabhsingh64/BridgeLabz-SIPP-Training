class stringCheck{
    public static void main(String[] args) {
        String str1 = "Amitabh";
        String str2 = "Amitabh";
        System.out.println("using inbuilt method:" + str1.equals(str2));
        System.out.println("code implementation with charAt():" + check(str1,str2));
    }
    public static boolean check(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                return false;
            }
        }
        return true;
    }
}