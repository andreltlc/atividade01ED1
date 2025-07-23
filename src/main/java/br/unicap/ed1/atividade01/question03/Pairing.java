package br.unicap.ed1.atividade01.question03;

public class Pairing {
    private Pair[] pairs;
    public Pair[] getPairs(){
       return pairs;
    }
    private String [] getList (String s){
        String [] getList = s.split(", ") ;
        return getList;
    
    }
    public Pair[] obtainPairs(String s1, String s2){
        String[] s1List = this.getList(s1);
        String[] s2List = this.getList(s2);
        Pair[] par = new Pair[s1List.length];
        if(s1List.length != s2List.length){
            throw new RuntimeException("Cannot obtain pairs with different sizes!");
        }
        if(s1.equals("")&&s2.equals("")){
            return new Pair[0] ;
        }
        else{
            for(int i = 0 ; i<s1List.length; i++){
                par [i] = new Pair( s1List[i],s2List[i]);
            }
        }
        return par;
    }
    public Pairing(String s1 , String s2){
        pairs = obtainPairs(s1, s2);

    }
    @Override
    public String toString(){
        String result = "" ;
        for(int i = 0 ; i<pairs.length;i++){
            if(i == pairs.length -1){
                result+=pairs[i];
            }
            else{
                result+= pairs[i] + ", ";
            }

        }
        return result;
    }

}
