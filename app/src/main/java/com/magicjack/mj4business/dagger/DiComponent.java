package com.magicjack.mj4business.dagger;

import com.magicjack.mj4business.MainApplication;
import com.magicjack.mj4business.data.persistent.DatabaseRealm;
import com.magicjack.mj4business.data.persistent.DbModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Magic Jack.
 */

@Singleton
@Component(modules = {
        ApplicationModule.class,
        DbModule.class
//        NetworkModule.class,
//        ServiceModule.class,
//        RepositoryModule.class,

})
public interface DiComponent {
    void inject(MainApplication mainApplication);
    void inject(DatabaseRealm databaseRealm);
}
