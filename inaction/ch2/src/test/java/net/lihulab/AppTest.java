package net.lihulab;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=AppConfig.class)
public class AppTest 
{
    @Autowired
    private CompactDisc cd;

    @Autowired
    private MediaPlayer mp;

    @Test
    public void shouldAnswerWithTrue()
    {

        assertNotNull(cd);
        cd.play();
    }

    @Test
    public void play() {
        mp.play();
    }
}
