@accountVerify
  Feature: Beymen Mobil Uygulamasi

  Scenario: Beymen Mobil Uygulamasi ile Uye Olma Otomasyonu
    Given Konum etkinlestirilir
    When Profilim butonuna tiklanir
    When Uye ol butonuna tiklanir
    When Eposta adresi yazilir
    When Sifre yazilir
    When Giris yap butonuna tiklanir.
    When Profilim butonuna tiklanir
    When Dogru email ile doğru hesaba girdigi verify edilir.





