package com.magicjack.mj4business.dagger;

import com.magicjack.mj4business.MainApplication;
/**
 * Created by Magic Jack.
 */

public class Injector {

    private static DiComponent diComponent;

    private Injector() {
    }

    public static void initializeApplicationComponent(MainApplication customApplication) {
        diComponent = DaggerDiComponent.builder()
                .applicationModule(new ApplicationModule(customApplication)).build();
    }

    public static DiComponent getApplicationComponent() {
        if (diComponent == null)
            throw new NullPointerException();
        return diComponent;
    }



}