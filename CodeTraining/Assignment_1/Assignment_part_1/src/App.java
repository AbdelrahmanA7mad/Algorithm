public class App {

    /* best = 0                               ==> o(1) --> worst canse
     * for i = 1 to n                         ==> o(n) --> worst canse
     *  interview candidate i                 ==> o(n) --> worst canse
     *  if candidate is better than best      ==> o(n) --> worst canse
     *       best = i                         ==> o(n) --> worst canse
     *       hire candidate                   ==> o(n) --> worst canse
     * 
     * ================================================================
     * 
     * worst case will be n*(Ch +Ci) 
     * 
     *  code impelemntaion
     */  
    public static void main(String[] args) throws Exception {

        interview(10);
    }
    public static void  interview(int n){
        int best = 0;
        for(int i=1;i<=n;i++){
            System.out.println("InterView With : "+i);
            if(bet(i,best)){
                best = i;
                System.out.println("emp is :" + best);
            }
        }

    }
    public static boolean bet(int cand , int best ){
        return cand>best;
    }
}
