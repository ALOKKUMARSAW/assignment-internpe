public class loop {
    public static void main(String[]args){
    outerLoop: //The level for outeer loop
    for(int i=1;i<=5;i++){
        innerLoop://The level for inner loop 
        for(int j=1;j<=5;j++){
            System.out.println("i: "+i+",j "+j);
            if(i==4 && j==4){
                break outerLoop;
            }
        }
    }
    
}
}

