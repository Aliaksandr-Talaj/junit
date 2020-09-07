package academy.junit.conf;

import academy.junit.dao.ItemDao;
import fathom.Module;

/**
 * The Components class is for binding your application's business
 * logic: managers, providers, etc.
 */
public class Components extends Module {

    @Override
    protected void setup() {
        // bind your application components here
        bind(ItemDao.class);
    }

}
