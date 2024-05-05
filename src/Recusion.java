public class Recusion {
    public static void main(String[] args) {
        Recusion r = new Recusion();
    }
  //  public int w = 0;

    public Recusion(){
        //recursiveMethod(5);
        System.out.println(recursiveMethod(5));
    }

    public int recursiveMethod(int i){
        //int w= i *(i+1);

//        if(i<0){ //Base case
//           System.out.println(w);
//        }
//        else{
//            System.out.println(w);
//           recursiveMethod(i-1);
//           System.out.println(w);
//        }

        if (i==1){
            //System.out.println(i);
            return i;
        }else{
            //System.out.println(i*recursiveMethod(i-1));
            return i*recursiveMethod(i-1);
        }

     //   System.out.println(i);
    }

}
