package tutorial.core.services;

import tutorial.mvc.entries.BlogEntry;

/**
 * Created by jsidhu on 20/04/16.
 */
public interface BlogEntryService {

    BlogEntry findEntry(Long id);
}
