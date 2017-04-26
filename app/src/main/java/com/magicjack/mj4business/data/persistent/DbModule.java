package com.magicjack.mj4business.data.persistent;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Magic Jack.
 */

@Module
public class DbModule {
    @Provides
    @Singleton
    public DatabaseRealm provideDatabaseRealm() {
            return new DatabaseRealm();
        }
}

