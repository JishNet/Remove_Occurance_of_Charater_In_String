public class Text {


    static String Remove(String st ,char target) {
            if(st.length()<1) return "" ;
            String Small_ans  = new String();
            if(st.charAt(0)!=target) {
                Small_ans+= st.charAt(0) ;
            }

            String s = Remove(st.substring(1),target) ;
            String ans = Small_ans + s ;
            return  ans ;


    }
    public static void main (String... args) {
        String s =  "JisJJJJJJJhaJJJJJJJJJJJnJJJJJJJJJJJJ" ;
        System.out.println(s) ;
        char a = 'J' ;

        System.out.println(Remove(s,a)) ;



    }
}


