

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class prueba.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class prueba
{
    private MusicOrganizer musicOrg1;

    /**
     * Default constructor for test class prueba
     */
    public prueba()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        musicOrg1 = new MusicOrganizer();
        musicOrg1.addFile("audio/BigBillBroonzy-BabyPleaseDontGo1.mp3");
        musicOrg1.addFile("audio/BlindBlake-EarlyMorningBlues.mp3");
        musicOrg1.addFile("audio/BlindLemonJefferson-matchBoxBlues.mp3");
        musicOrg1.addFile("audio/BlindLemonJefferson-OneDimeBlues.mp3");
        
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
