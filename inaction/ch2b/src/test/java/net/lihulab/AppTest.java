package net.lihulab;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=SystemConfig.class)
public class AppTest 
{
    @Autowired
    private MediaPlayer mp;

    @Test
    public void shouldAnswerWithTrue()
    {
        assertNotNull(mp);
        mp.play();
        assertTrue( true );
    }
}
