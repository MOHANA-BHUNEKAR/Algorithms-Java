package colorful;

public class Thread2 extends Thread{
	String p,q;
	
	public Thread2(String s) {
		// TODO Auto-generated constructor stub
		
		if(s.equals("thread1"))
		{
			p="thread1";
			System.out.println(p);
		}
		
		else
		{
			
			q="thread2";
			System.out.println(q);
		}
	}

	public void run(){  
		  for(int i=1;i<5;i++){  
		  /*  try
		    {
		    	Thread.sleep(500);
		    }catch(InterruptedException e){
		    	System.out.println(e);
		    	}  */
		    System.out.println(i+ Thread.currentThread().getName());  
		  }  
		 }  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread2 t1 = new Thread2("thread1");
		Thread2 t2 = new Thread2("thread2");
		
		System.out.println(t1.getName()+"------");

		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		
		t1.setPriority(MAX_PRIORITY);
		t2.setPriority(MIN_PRIORITY);

	}

}
