package com.magicjack.mj4business.dagger;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.magicjack.mj4business.MainApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Magic Jack.
 */

@Module
public class ApplicationModule {
    private final MainApplication application;

    public ApplicationModule(MainApplication application) {
        this.application = application;
    }

    @Provides
    @Singleton
    MainApplication provideMainApplication() {
        return application;
    }

    @Provides
    @Singleton
    SharedPreferences provideSharedPreferences(MainApplication mainApplication) {
        return PreferenceManager.getDefaultSharedPreferences(mainApplication);
    }

    @Provides
    @Singleton
    Context provideContext() {
        return application;
    }

}