
public class MyString implements IString{
    //ue oai
    public boolean check(char str){
        if(str == 'u' || str == 'U' || str=='o' || str=='O' || str=='e' || str=='E' || str=='a' || str=='A' || str=='i' || str=='I')
            return true;
        return false;
    }
    
    @Override
    public int f1(String str) {
        String[] AS = str.split("\\s+");
        int rt = 0;
        for(int i = 0; i < AS.length; i++){
            int count =0;
            for(int j = 0; j < AS[i].length(); j++){
                if(AS[i].length() != 0 && check(AS[i].charAt(j)) == false) count++;
            }
            if(count >= 2) rt++;
        }
        return rt;
    }

    @Override
    public String f2(String str) {
        int count = 0;
        String rt = "";
        str+=" ";
        str = str.toLowerCase();
        char[] a = str.toCharArray();
        for(int i =0; i<a.length-1;i++){
            for(int j = i + 1; j < a.length; j++){
                if(Character.isLetterOrDigit(a[i]) && rt.contains(a[i] + "") == false &&a[i] == a[j]) rt += a[i];
            }
        }
        return rt;
    }
    
}
