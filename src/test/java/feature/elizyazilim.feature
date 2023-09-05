Feature:

  Scenario:
    Given
    When üst menüde yer alan tüm özellikler butonuna tıkla.
    And açılan pencerede satış yönetimi özelliğini incele butonuna tıkla.
    And hemen kayıt ol butonuna tıkla.
    Then açılan sayfanın kayıt olma sayfası olduğunu kontrol et.



  Scenario: Tüm Özellikler Sayfasında Yer Alan Randevu Yönetimi Fonksiyonunun Doğrulanması
    Given argist websitesine eriş.
    When üst menüde yer alan tüm özellikler butonuna tıkla.
    And açılan pencerede randevu yönetimi özelliğini incele butonuna tıkla.
    And hemen kayıt ol butonuna tıkla.
    Then açılan sayfanın kayıt olma sayfası olduğunu kontrol et.


  Scenario: Tüm Özellikler Sayfasında Yer Alan Servis Yönetimi Fonksiyonunun Doğrulanması
    Given argist websitesine eriş.
    When üst menüde yer alan tüm özellikler butonuna tıkla.
    And açılan pencerede servis yönetimi özelliğini incele butonuna tıkla.
    And hemen kayıt ol butonuna tıkla.
    Then açılan sayfanın kayıt olma sayfası olduğunu kontrol et.


  Scenario: Tüm Özellikler Sayfasında Yer Alan E-mağaza Yönetimi Fonksiyonunun Doğrulanması
    Given argist websitesine eriş.
    When üst menüde yer alan tüm özellikler butonuna tıkla.
    And açılan pencerede e-mağaza yönetimi özelliğini incele butonuna tıkla.
    And ücretsiz emağazanı aç butonuna tıkla.
    Then açılan sayfanın hesap oluşturma sayfası olduğunu kontrol et.



  Scenario: Tüm Özellikler Sayfasında Yer Alan Stok Yönetimi Fonksiyonunun Doğrulanması
    Given argist websitesine eriş.
    When üst menüde yer alan tüm özellikler butonuna tıkla.
    And açılan pencerede stok yönetimi özelliğini incele butonuna tıkla.
    And ücretsiz fiyat teklifi butonuna tıkla.
    Then açılan sayfanın hesap oluşturma sayfası olduğunu kontrol et.


  Scenario: Tüm Özellikler Sayfasında Yer Alan Teklif Yönetimi Fonksiyonunun Doğrulanması
    Given argist websitesine eriş.
    When üst menüde yer alan tüm özellikler butonuna tıkla.
    And açılan pencerede teklif yönetimi özelliğini incele butonuna tıkla.
    And ücretsiz fiyat teklifi butonuna tıkla.
    Then açılan sayfanın hesap oluşturma sayfası olduğunu kontrol et.