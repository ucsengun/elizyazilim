Feature: Menü Kontrolü

  Scenario: Blog Sayfasındaki Devamını Oku Fonksiyonunun Doğrulanması
    Given eliz yazılım websitesine eriş.
    When menüye tıkla.
    And blog butonuna tıkla.
    And kurumsal kimlik başlığı altındaki devamını oku butonuna tıkla.
    Then kurumsal kimlik makalesinin tamamının açıldığını kontrol et.


