package com.somnus.designPatterns.singleton;

public class LazySingleton{
	private static LazySingleton instance ;
	
	private LazySingleton(){}
	
	public static LazySingleton getInstance(){
		if(instance == null){
			instance = new LazySingleton();
		}
		return instance;
	}
}

class LazySingleton2{
    private static LazySingleton2 instance ;
    
    private LazySingleton2(){}
    
    public static synchronized LazySingleton2 getInstance(){
        if(instance == null){
            instance = new LazySingleton2();
        }
        return instance;
    }
}

class LazySingleton3{
    private static LazySingleton3 instance ;
    
    private LazySingleton3(){}
    
    public static LazySingleton3 getInstance(){
        if(instance == null){
            synchronized (LazySingleton3.class) {  
                instance = new LazySingleton3();   
            } 
        }
        return instance;
    }
}

class LazySingleton4{
    private static LazySingleton4 instance ;
    
    private LazySingleton4(){}
    
    public static LazySingleton4 getInstance(){
        //第一重判断  
        if (instance == null) {  
            //锁定代码块  
            synchronized (LazySingleton4.class) {  
                //第二重判断  
                if (instance == null) {  
                    instance = new LazySingleton4(); //创建单例实例  
                }  
            }  
        }  
        return instance;
    }
}
