public class fibonacci{
	public static int of(int n){
	if(n==0){
		return 0;
	}
	if(n==1){
		return 1;
	}
	return of(n-1)+of(n-2);
	}
	public static void main(String[] args){
	int i;
	for(i=1;i<=200;i++){
		System.out.println(of(i));
	}
	}
}