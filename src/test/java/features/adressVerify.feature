@adressVerify
Feature: Beymen Mobil Uygulamasi
  Background:
    Given Konum etkinlestirilir
    Given Profilim butonuna tiklanir
    Given Uye ol butonuna tiklanir
    Given Eposta adresi yazilir
    Given Sifre yazilir
    Given Giris yap butonuna tiklanir.
    Given Profilim butonuna tiklanir
    Given Adreslerim butonuna tiklanir
    Given Yeni adres ekle butonuna tiklanir
    Given Adres bilgileri girilir
    Given Menu sayfasina gidilir
    Given Ana sayfaya gidilir

  Scenario: Beymen Mobil Uygulamasi ile Kayitli Adresi Verify Etme
    When Kategoriler butonuna tiklanir
    When Erkek alanina tiklanir
    When Yeni gelenler kategorisine tiklanir
    When Urun secilir
    When Urun sepete eklenir
    When Sepet sayfasina gidilir
    When Urun satin alinir
    When Satin alma sayfasinda adres verify edilir
    When Sepet sayfasina donulur.
    When Yeni gelenler sayfasina donulur
    When Kategoriler sayfasina donulur.
    When Profilim butonuna tiklanir
    When Adreslerim butonuna tiklanir
    When Adres Duzenle butonuna tiklanir
    When Eklenen adres silinir.
