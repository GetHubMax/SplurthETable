package test;

import static org.junit.Assert.*;

import org.junit.Test;
import static core.Main.vaildSymbol;
import static core.Main.symbolGentrater;
import static core.Main.numSymbols;
public class BasicTest {

	@Test
	public void vaid00(){
		assertTrue(vaildSymbol("abc", "ab"));
		 
		
	} 
	
	@Test
	public void vaid01(){
		assertTrue(vaildSymbol("abc", "ac"));
		 
		
	} 
	@Test
	public void vaid02(){
		assertTrue(vaildSymbol("abc", "bc"));
		 
		
	} 
	
	
	@Test
	public void vaid03(){
		assertTrue(vaildSymbol("abbc", "bc"));
		 
		
	}
	
	@Test
	public void vaid04(){
		assertTrue(vaildSymbol("abbc", "bb"));
		 
		
	}
	
	
	@Test
	public void invaid00(){
		assertFalse(vaildSymbol("abc", "ba"));
		 
		
	} 
	
	@Test
	public void invaid01(){
		assertFalse(vaildSymbol("abc", "ca"));
		 
		
	} 
	@Test
	public void invaid02(){
		assertFalse(vaildSymbol("abc", "aa"));
		 
		
	} 
	@Test
	public void invaid03(){
		assertFalse(vaildSymbol("abc", "cc"));
		 
		
	} 
	@Test
	public void invaid04(){
		assertFalse(vaildSymbol("abbc", "cc"));
		 
		
	}
	
	@Test
	public void invaid05(){
		assertFalse(vaildSymbol("abbc", "ba"));
		 
		
	}
	
	@Test
	public void vaidDailyTest00(){
		assertTrue(vaildSymbol("Spenglerium", "Ee"));
		
		
		
	
	}
	@Test
	public void vaidDailyTest01(){
		assertTrue(vaildSymbol("Zeddemorium", "Zr"));
	}
	@Test
	public void vaidDailyTest02(){
		assertTrue(vaildSymbol("Venkmine", "Kn"));
	}
	
	@Test
	public void invaidDailyTest00(){
		assertFalse(vaildSymbol("Stantzon", "Zt"));
	}
	@Test
	public void invaidDailyTest01(){
		assertFalse(vaildSymbol("Melintzum", "Nn"));
	}
	@Test
	public void invaidDailyTest02(){

		assertFalse(vaildSymbol("Tullium", "Ty"));
	}
	@Test
	public void charComparerTest00(){
		assertTrue(Character.compare('a', 'b')<0);
		
	}
	@Test
	//Just need to know how Character compare behaves quickly
	public void charComparerTest01(){
		assertTrue(Character.compare('A', 'b')<0);
		
	}
	
	
	@Test
	public void symbolGenVaid00(){
		String elm = "abc";
		String syb = symbolGentrater(elm);
		assertTrue(vaildSymbol(elm,syb));
		assertTrue(syb.equals("Ab"));
	}

	
	@Test
	public void symbolGenVaid01(){
		String elm = "acb";
		String syb = symbolGentrater(elm);
		assertTrue(vaildSymbol(elm,syb));
		assertTrue(syb.equals("Ab"));
	}

	
	@Test
	public void symbolGenVaid02(){
		String elm = "cab";
		String syb = symbolGentrater(elm);
		assertTrue(vaildSymbol(elm,syb));
		assertTrue(syb.equals("Ab"));
	}

	

	@Test
	public void symbolGenVaid03(){
		String elm = "Gozerium";
		String syb = symbolGentrater(elm);
		assertTrue(vaildSymbol(elm,syb));
		assertTrue(syb.equals("Ei"));
	}

	@Test
	public void symbolGenVaid04(){
		String elm = "Slimyrine";
		String syb = symbolGentrater(elm);
		assertTrue(vaildSymbol(elm,syb));
		assertTrue(syb.equals("Ie"));
	}
	
	@Test
	public void numSymbolsVaidTest00(){
		assertTrue(numSymbols("Zuulon")==11);
		
		
	}
	
	@Test
	public void numSymbolsVaidTest01(){
		assertTrue(numSymbols("aa")==1);
		
		
	}
	
	@Test
	public void numSymbolsVaidTest02(){
		assertTrue(numSymbols("aab")==2);
		
		
	}
	
	
	@Test
	public void numSymbolsVaidTest03(){
		assertTrue(numSymbols("abc")==3);
		
		
	}
	
	@Test
	public void numSymbolsVaidTest04(){
		assertTrue(numSymbols("abcd")==3+2+1);
		
	}
	
	@Test
	public void numSymbolsVaidTest05(){
		assertTrue(numSymbols("abcdd")==3+2+1+1);
		
	}
	
	@Test
	public void numSymbolsVaidTest06(){
		assertTrue(numSymbols("abcde")==4+3+2+1);
		
	}
	

	@Test
	public void numSymbolsVaidTest07(){
		assertTrue(numSymbols("abcddde")==4+3+2+1+1);
		
	}
	
	
	
}
