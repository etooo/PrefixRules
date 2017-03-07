public class test{
    public static void main(String args[]){

        int a,i,j;
	String X = args[0];
	String Y = args[1];
	int x = Integer.parseInt(X);
	int y = Integer.parseInt(Y);

       	for(i=0;i<x;i++){
	    for(j=0;j<y;j++){
		a = (int)(Math.random()*3);
		if(a==2){
		    for( ;j < y; j++)
			System.out.print("*");
		}
		else
		    System.out.print(a);
	    }
	    System.out.println();
	}
    }
}

 
