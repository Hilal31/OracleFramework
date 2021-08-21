package Utilities;

import Page.LocatePage;

public class Pages {
    public LocatePage getLocatePage() {

        return (locatePage == null) ? locatePage = new LocatePage() : locatePage;
    }

    private LocatePage locatePage;
}
