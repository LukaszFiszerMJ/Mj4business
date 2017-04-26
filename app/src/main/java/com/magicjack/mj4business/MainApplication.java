package com.magicjack.mj4business;

import android.app.Application;

import com.magicjack.mj4business.dagger.Injector;
import com.magicjack.mj4business.data.persistent.DatabaseRealm;

import javax.inject.Inject;

/**
 * Created by Magic Jack.
 */

public class MainApplication extends Application {

    @Inject
    DatabaseRealm realmDatabase;

    @Override
    public void onCreate() {
        super.onCreate();
        init();
    }

    private void init() {
        initDagger();
        initRealm();
    }

    protected void initDagger() {
        Injector.initializeApplicationComponent(this);
        Injector.getApplicationComponent().inject(this);
    }


    protected void initRealm(){
        realmDatabase.setup();
    }

}
