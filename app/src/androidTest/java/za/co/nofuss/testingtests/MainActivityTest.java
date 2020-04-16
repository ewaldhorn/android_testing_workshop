package za.co.nofuss.testingtests;

import android.content.Context;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainActivityTest {

    @Test
    public void confirmCorrectApplication() {
        Context appContext = androidx.test.core.app.ApplicationProvider.getApplicationContext();
        assertEquals("za.co.nofuss.testingtests", appContext.getPackageName());
    }

    @Test
    public void confirmMainViewActivated() {

    }

}