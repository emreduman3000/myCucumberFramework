@testcase2 @testcase
Feature: Automation practise 2
  Scenario: gecersiz email ve password hatasi dogrulama
    Given user web sayfasinda
    And user sign in linkine tiklar
    And email kutusuna gecersiz email ve password yazar ve sign in butonuna tiklar
    Then error mesajinin Authentication failed. oldugunu dogrulayin


#son 2 satır ı tanımlamam yeterlı, zaten bi onlar ısaretlı