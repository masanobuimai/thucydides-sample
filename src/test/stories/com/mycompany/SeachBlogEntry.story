package com.mycompany

import com.mycompany.steps.BuildShokuninSteps
import com.mycompany.requirements.Application.Search2.SearchByBlogEntry

using "thucydides"

thucydides.uses_default_base_url "http://build-shokunin.org/"
thucydides.uses_steps_from BuildShokuninSteps
thucydides.tests_story SearchByBlogEntry

scenario "Looking up the keyword of 'JUC'", {
    given "BuildShokuninのトップページに訪れる", {
        build_shokunin.is_the_home_page()
    }
    when "キーワード 'JUC' でブログエントリを検索する", {
        build_shokunin.looks_for "JUC"
    }
}
