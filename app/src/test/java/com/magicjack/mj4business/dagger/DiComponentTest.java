package com.magicjack.mj4business.dagger;

import com.magicjack.mj4business.data.persistent.DbModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Magic Jack.
 */

@Singleton
@Component(modules = {
        ApplicationModuleTest.class,
//        NetworkModule.class,
//        ServiceModule.class,
//        RepositoryModule.class,
        DbModule.class
})
public class DiComponentTest {

}
