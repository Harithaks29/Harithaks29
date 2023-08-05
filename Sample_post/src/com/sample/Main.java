package com.sample;

import com.sample.create.Delete;//import single class
import com.sample.create.Insert;
import com.sample.create.Select;

public class Main {
	public static void main(String args[]) 
{
    
    Insert ob = new Insert();
	ob.insertion();	
	
	Select ob1 = new Select();
	ob1.selection();
	
	Delete ob2 = new Delete();
	ob2.deletion();
}
}