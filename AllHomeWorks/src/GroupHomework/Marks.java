package GroupHomework;
	
	public abstract class Marks {
		
		int math, eng, java,bio,count;
		
		Marks(int math, int eng, int java){
			this.math=math;
			count++;
			this.eng=eng;
			count++;
			this.java=java;
			count++;
		}
		
		Marks(int math, int eng, int java, int bio){
			this.math=math;
			count++;
			this.eng=eng;
			count++;
			this.java=java;
			count++;
			this.bio=bio;
			count++;
		}
		
		public abstract void getPercentage();
	}
	class StudentA extends Marks{
		
		StudentA(int math, int eng, int java){
			super(math,eng,java);
		}
		@Override
		public void getPercentage() {
			
			double averageP=(math+eng+java)/count;
			
			System.out.println("The average marks of Student A is "+averageP+ " %");
		}
		
	}
	class StudentB extends Marks{
		
		StudentB(int math, int eng, int java, int bio){
			super(math,eng,java,bio);
		}
		@Override
		public void getPercentage() {
			
			double averageP=(math+eng+java+bio)/count;
			
			System.out.println("The average marks of Student B is "+averageP+ " %");
		}
		
	}


