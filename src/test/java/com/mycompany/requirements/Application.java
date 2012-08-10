package com.mycompany.requirements;

import net.thucydides.core.annotations.Feature;

public class Application {
    @Feature
    public class Search {
        public class SearchByKeyword {}
        public class SearchByKeyword_Ja {}
    }
    @Feature
    public class Search2 {
        public class SearchByBlogEntry {}
    }
}
