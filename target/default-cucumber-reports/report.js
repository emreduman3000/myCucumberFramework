$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Automation_practice.feature");
formatter.feature({
  "name": "Automation Practise 1",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@testcase1"
    },
    {
      "name": "@testcase"
    }
  ]
});
formatter.scenario({
  "name": "Automation practice create account",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@testcase1"
    },
    {
      "name": "@testcase"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "user web sayfasinda",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.AutomationPracticeTCSteps.user_web_sayfasinda()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user sign in linkine tiklar",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.AutomationPracticeTCSteps.user_sign_in_linkine_tiklar()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user Create an account bolumune email adresi girer",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.AutomationPracticeTCSteps.user_Create_an_account_bolumune_email_adresi_girer()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Create an Account butonuna basar",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.AutomationPracticeTCSteps.create_an_Account_butonuna_basar()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user kisisel bilgilerini ve iletisim bilgilerini girer",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.AutomationPracticeTCSteps.user_kisisel_bilgilerini_ve_iletisim_bilgilerini_girer()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user Register butonuna basar",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.AutomationPracticeTCSteps.user_Register_butonuna_basar()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "hesap olusturuldugunu dogrulayin",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.AutomationPracticeTCSteps.hesap_olusturuldugunu_dogrulayin()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
});