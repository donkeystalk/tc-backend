package dardo.backbone.repo;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import dardo.backbone.model.Patch;

@ContextConfiguration(locations={"classpath:config/applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestPatchRepo {
	
	@Autowired
	private PatchRepo repo;
		
	@Rollback(true)
	@Test
	public void testInsertPatch()
	{
		long count = repo.count();
		Patch patch = createPatch();
		repo.save(patch);
		assertEquals(count, repo.count() - 1);		
	}


	private Patch createPatch() {
		Patch patch = new Patch();
		return patch;
	}
	
}
