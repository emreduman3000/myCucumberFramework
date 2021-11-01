@AdaMarket
Feature:Ada Market Products
  Scenario Outline: Download Product Images

    Given user navigate to eMarket website
    And select the "<catagory>" catagory from HomePage
    And select a "<subcatagory>" subCatagory
    When Download All Product Images
    Then Verify all images by their barcode
    Examples:
      | catagory | subcatagory |
      |TEMEL GIDA| DONDURMA    |

