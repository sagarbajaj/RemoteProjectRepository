package com.sagar.c;

import org.junit.Before;
import static org.junit.Assert.assertEquals;


/**
 * Unit test for simple App.
 */
public class MainPracTest 

{
	MainPrac c;
@Before
public void setup(){c=new MainPrac();}
public void test(){
	assertEquals(c.retVal(),"sagar");
}
}
