package colorful;

public class Test222 {

	public static void main(String[] args) {

		String s= "abc";
		System.out.println(s.concat("def"));
		
		System.out.println(s);
		
	    String s1=new String("Welcome");//creates two objects and one reference variable  
	    String s2=new String("Welcome");//creates two objects and one reference variable 
	    String s3="ggg";
	    String s4="ggg";

	    if(s4==s3)
	    	System.out.println("jiii");
	    
	//    String ss="111222ABCDEFG";  
	//    byte[] barr=ss.getBytes();  
	//    for(int i=0;i<barr.length;i++){  
	//    System.out.println(barr[i]);  
	 //   }  
	    
	    String sh="thiiis is index of example";  
	    String sx= sh.replaceAll("i+", "zzz");
	    System.out.println(sx);
	  //passing substring  
	  int index1=sh.indexOf("i");//returns the index of is substring  
	  int index2=sh.indexOf("i",index1+1);//returns the index of index substring  
	  System.out.println(index1+"  "+index2);//2 8  
	    
	  //passing substring with from index  
	  int index3=sh.indexOf("is",4);//returns the index of is substring after 4th index  
	  System.out.println(index3);//5 i.e. the index of another is  
	    
	  //passing char value  
	  int index4=sh.indexOf('s');//returns the index of s char value  
	  System.out.println(index4);//3  
	}

}
