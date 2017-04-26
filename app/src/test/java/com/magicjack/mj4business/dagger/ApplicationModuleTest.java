package com.magicjack.mj4business.dagger;

import android.content.Context;

import org.robolectric.RuntimeEnvironment;

/**
 * Created by Magic Jack.
 */

public class ApplicationModuleTest extends ApplicationModule {

    public ApplicationModuleTest() {
            super(null);
    }

    public Context provideContext() {
            return RuntimeEnvironment.application.getApplicationContext();
    }

}
