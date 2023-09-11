Feature: Menü Kontrolü

  Scenario: Hakkımızda Sayfasında Yer Alan Sağa Kaydırma Fonksiyonunun Doğrulanması
    Given eliz yazılım websitesine eriş.
    When menüye tıkla.
    And hakkımızda butonuna tıkla.
    And sağa kaydırma butonuna tıkla.
    Then sağa kaydırıldığını kontrol et.



  Scenario: Hakkımızda Sayfasında Yer Alan Sola Kaydırma Fonksiyonunun Doğrulanması
    Given eliz yazılım websitesine eriş.
    When menüye tıkla.
    And hakkımızda butonuna tıkla.
    And sola kaydırma butonuna tıkla.
    Then sola kaydırıldığını kontrol kontrol et.


