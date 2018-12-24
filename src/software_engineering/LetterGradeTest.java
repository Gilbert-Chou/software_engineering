package software_engineering;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LetterGradeTest {
	
	public LetterGrade lg;

	@BeforeEach
	void setUp() throws Exception {
		lg = new LetterGrade();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGradeA() {
		Assert.assertEquals('A', lg.letterGrade(100));
		Assert.assertEquals('A', lg.letterGrade(90));
	}
	
	@Test
	void testGradeB() {
		Assert.assertEquals('B', lg.letterGrade(89));
		Assert.assertEquals('B', lg.letterGrade(80));
	}
	
	@Test
	void testGradeC() {
		Assert.assertEquals('C', lg.letterGrade(79));
		Assert.assertEquals('C', lg.letterGrade(70));
	}
	
	@Test
	void testGradeD() {
		Assert.assertEquals('D', lg.letterGrade(69));
		Assert.assertEquals('D', lg.letterGrade(60));
	}
	
	@Test
	void testGradeF() {
		Assert.assertEquals('F', lg.letterGrade(59));
		Assert.assertEquals('F', lg.letterGrade(0));
	}
	
	@Test
	void testGradeX() {
		Assert.assertEquals('X', lg.letterGrade(101));
		Assert.assertEquals('X', lg.letterGrade(-1));
	}

}
