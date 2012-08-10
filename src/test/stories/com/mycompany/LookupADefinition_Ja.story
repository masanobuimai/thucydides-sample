package com.mycompany

import com.mycompany.steps.EndUserSteps
import com.mycompany.requirements.Application.Search.SearchByKeyword_Ja

using "thucydides"

thucydides.uses_default_base_url "http://en.wiktionary.org/wiki/Wiktionary:Main_Page"
thucydides.uses_steps_from EndUserSteps
thucydides.tests_story SearchByKeyword_Ja

scenario "Looking up the definition of 'apple'(ja)", {
    given "利用者は the Wikionary のホームページに移動します。", {
        end_user.is_the_home_page()
    }
    when "利用者は単語「apple」の意味を調べます。", {
        end_user.looks_for "apple"
    }
    then "「apple」の定義が見つかるはず。", {
       end_user.should_see_definition_containing_words "A common, round fruit"
    }
}
