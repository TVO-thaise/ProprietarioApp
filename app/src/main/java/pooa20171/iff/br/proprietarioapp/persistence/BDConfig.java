package pooa20171.iff.br.proprietarioapp.persistence;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by aluno on 07/08/17.
 */

public class BDConfig {
    @Override
            public void onCreate() {
                   super.onCreate();

                   Realm.init(getApplicationContext());

                    RealmConfiguration realmConfiguration = new RealmConfiguration.Builder().name(Realm.DEFAULT_REALM_NAME).schemaVersion(0).deleteRealmIfMigrationNeeded().build();
                   Realm.setDefaultConfiguration(realmConfiguration);
               }
    }
}
