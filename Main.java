package com.aadi.methodsW3;

//Public and private methods have to be called by creating objects, static methods do not
public class Main {
	int x;	//Initialize Variables Here
	boolean key;
	int speed;
	boolean lock;
	
	public Main() {//Constructor
		x=5;//Placeholder
	}
	
	public class Password {
		private String pwd;//Private - Restricted Access
	
	
		public String getpwd() {//Getter
			return pwd;
		}
	
		public void setPwd(String newPwd) {//Setter
			this.pwd=newPwd;
		}
	}
	
	public void FirstMethod(int speed) {// Public Method(Take argument speed)
		

		//Main speed = new Main();//Object
		speed=speed/5;//Operate on input speed
		System.out.println("This is a public method, speed is "+speed);//Print
		
	}
	
	private void SecondMethod(boolean lock) {//Private Method(Take argument lock)
		
		if(lock==false){//If statement
			
			 key=false;
		}
		else {
			key=true;
		}
		System.out.println(key);//Print
	}
	
	

	
	
	public static void main(String[] args) {
		//Place code to run here
		
		Main objMethod2 = new Main();//Create object to call private method
		objMethod2.SecondMethod(true);
		
		Main FirstMethod = new Main();//Create object to call public method
		FirstMethod.FirstMethod(50);//Set speed here
        
		//Main pwdObj = new Password();
		//pwdObj.setPwd("1234");
		
	
		
		
	}

}
