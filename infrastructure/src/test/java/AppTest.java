import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class AppTest{
	
	@Test
	public void AppRunIsTrueTest(){
		App a = new App();
		assertTrue(a.run());
	}
	
}