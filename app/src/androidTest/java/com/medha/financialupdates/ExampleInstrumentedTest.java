package com.medha.financialupdates;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import retrofit2.Retrofit;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.medha.financialupdates", appContext.getPackageName());


    }

    @Test
    public void showResponse() throws Exception{
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://data.consumerfinance.gov/")
                .build();

        GovService service = retrofit.create(GovService.class);
        assertTrue((service.listOfcomplaints() != null));
    }
}
