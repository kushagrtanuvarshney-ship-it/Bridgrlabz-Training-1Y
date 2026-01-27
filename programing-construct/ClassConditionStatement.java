class ConditionStatement{
	public static void main {String[] args} {
		for (int i= 1; i<=10;i++){
			Scanner input = new Scanner(System.in);
			int mark = input.nextInt();
			if (marks<50){
				System.out.println("fail");
			}
            else if (mark>=50 && mark<60){
                System.out.println("D grade");
            else if (mark>=60 && mark<70){
                System.out.println("C grade");
			else if (mark>=70 && mark<80){
                System.out.println("B grade");
			else if (mark>=80 && mark<90){
                System.out.println("A grade");	
			else{
                System.out.println("O grade");
			}}}}				