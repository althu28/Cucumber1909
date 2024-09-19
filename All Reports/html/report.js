$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Imdb.feature");
formatter.feature({
  "name": "to validate the imdb page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Imdb"
    }
  ]
});
formatter.scenario({
  "name": "to validate the imdb page by searching any film",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Imdb"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user have to enter the film name and click the enter button for first drop down name suggestion",
  "keyword": "When "
});
formatter.match({
  "location": "Step.user_have_to_enter_the_film_name_and_click_the_enter_button_for_first_drop_down_name_suggestion()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to scroll down and scroll up",
  "keyword": "And "
});
formatter.match({
  "location": "Step.user_have_to_scroll_down_and_scroll_up()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to take screenshot for the film",
  "keyword": "And "
});
formatter.match({
  "location": "Step.user_have_to_take_screenshot_for_the_film()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to get the film name, synopsis and director name",
  "keyword": "And "
});
formatter.match({
  "location": "Step.user_have_to_get_the_film_name_synopsis_and_director_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to close the Imdb tab",
  "keyword": "Then "
});
formatter.match({
  "location": "Step.user_have_to_close_the_Imdb_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});