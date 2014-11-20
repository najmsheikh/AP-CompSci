class stndrdDev {
	public static void main(String[] args){
		int[] MKFC1TC = {58,84,79,80,92,79,92,73,92,85,85,82,68,69,60,49,78,87,65,95,30,88,64,83,71,37,59,75,89,65,83,76,65,92};
		int total = 0,pos,avg=0,devi=0;
		double sum2=0;
		for(pos = 0; pos<MKFC1TC.length; pos++){
			total += MKFC1TC[pos];
		}
		avg = total/MKFC1TC.length;
		
		for(pos = 0;pos<MKFC1TC.length; pos++){
			devi += Math.pow((MKFC1TC[pos] - avg), 2);
		}
		sum2 = devi/MKFC1TC.length;
		sum2 = Math.sqrt(sum2);

		System.out.println("Your calcualted average is " + avg + " with a standard deviation of " + Math.round(sum2*100.0)/100.0);
	}
}
