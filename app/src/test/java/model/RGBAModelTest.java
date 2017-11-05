package model;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Class Under Test (CUT): RGBAModel.java
 *
 * Purpose: Test every combination of Red, Green and Blue.
 *
 * @author Created by rajatsen on 2017-11-04.
 */

public class RGBAModelTest {
    private static final int TOLERANCE = 0;

    private RGBAModel mModel;

    @Before
    public void setUp() throws Exception {
        mModel = new RGBAModel();
        mModel.setAlpha( RGBAModel.MAX_ALPHA );
    }

    @Test
    public void getSetRGB() throws Exception {
        for( int red = RGBAModel.MIN_RGB; red <= RGBAModel.MAX_RGB; red++ ) {
            mModel.setRed( red );
            assertEquals( "Test > Red", red, mModel.getRed(), TOLERANCE );

            for ( int green = RGBAModel.MIN_RGB; green <= RGBAModel.MAX_RGB; green++ ) {
                mModel.setGreen( green );
                assertEquals( "Test > Green", green, mModel.getGreen(), TOLERANCE );

                for( int blue = RGBAModel.MIN_RGB; blue <= RGBAModel.MAX_RGB; blue++ ) {
                    mModel.setBlue( blue );
                    assertEquals( "Test > Blue", blue, mModel.getBlue(), TOLERANCE );
                }
            }
        }
    }
}