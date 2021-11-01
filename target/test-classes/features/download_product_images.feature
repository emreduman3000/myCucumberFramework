@AdaMarket
Feature:
  Scenario Outline: Download Product Images

    Given user navigate to eMarket website
    And select the "<catagory>" catagory from HomePage
    And select a "<subCatagory>"subCatagory
    When Download All Product Images
    Then Verify all images by their barcode
    Examples:
      | catagory | subCatagory |
      |TEMEL GIDA|BAKLİYATLAR  |

