package com.designPatterns.Singleton;
 
public class ThreadSafeSingleton extends Thread implements Runnable{
 
    private static ThreadSafeSingleton instance;
     
    private ThreadSafeSingleton(){}
     
    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance == null){
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
    
    public void display()
    {
    	System.out.println("Current thread is "+Thread.currentThread().getName()+
				"and Current Id is "+Thread.currentThread().getId());
    	}
     
   /* public static void getData()
    {
    	return ("Thread deatils are "+Thread.currentThread());
    }*/
    public static void main(String[] args) throws InterruptedException
    {
    	for(int i=0;i<5;i++)
    	{
    		ThreadSafeSingleton t=ThreadSafeSingleton.getInstance();
    	
    		t.display();
    	   	}
    }

	@Override
	public void run() {
		System.out.println("Thread "+Thread.currentThread().getId()+"started..");
		display();
	}
}