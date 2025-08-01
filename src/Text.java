public class Text {


    static String Remove(String st ,int length,char target, int idx ) {
            if(idx>=length) return  " ";
            String Small_ans  = new String();
            if(st.charAt(idx)!=target) {
                Small_ans+= st.charAt(idx) ;
            }

            String s = Remove(st,length,target,idx+1) ;
            String ans = Small_ans + s ;
            return  ans ;


    }
    public static void main (String... args) {
        String s =  "JisJJJJJJJhaJJJJJJJJJJJnJJJJJJJJJJJJ" ;
        int n = s.length() ;
        System.out.println(s) ;
        char a = 'J' ;

        System.out.println(Remove(s,n,a,0)) ;



    }
}


