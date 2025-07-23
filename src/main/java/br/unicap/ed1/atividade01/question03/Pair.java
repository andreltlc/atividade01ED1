package br.unicap.ed1.atividade01.question03;

public class Pair {
    public String left;
    public String right;

    public Pair( String left , String right){
        this.left = left;
        this.right = right;
    }
    public String getLeft(){
        return this.left;
      }
    public String getRight(){
        return this.right;
      }
    @Override
    public String toString() {
        
        return "("+this.left+", "+this.right+")";
    }
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Pair){
          Pair other = (Pair) obj;
          return this.left.equals(other.left)&& this.right.equals(other.right);
        }
        else{
          return false;
        }
    }
}
