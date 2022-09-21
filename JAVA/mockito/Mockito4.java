package mokito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Mockito4 {

	@Test
	public void test() {
		List<String> list = new ArrayList<>();
		List<String> spyOnList = spy(list);
		
		when(spyOnList.size()).thenReturn(10);
		assertEquals(10,spyOnList.size());
		
		//calling real methods since below methods are not stubbed
		spyOnList.add("hemanth");
		spyOnList.add("hanish");
		assertEquals("hemanth",spyOnList.get(0));
		assertEquals("hanish",spyOnList.get(1));
	}

}
