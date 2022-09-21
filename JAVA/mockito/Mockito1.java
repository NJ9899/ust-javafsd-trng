package mokito;

import static org.mockito.Mockito.verify;

import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

public class Mockito1 {

	@Test
	public void test_mockito_verify() {
		
		@SuppressWarnings("unchecked")
		List<String> mockedList = Mockito.mock(List.class);
		
		mockedList.add("first-element");
		mockedList.add("second-element");
		mockedList.add("third-element");
		mockedList.add("third-element");
		mockedList.clear();
		
		verify(mockedList).clear();
	}

}
