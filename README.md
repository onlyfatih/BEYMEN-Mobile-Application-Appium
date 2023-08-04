# BEYMEN-Mobile-Application-Appium

Tabii, elbette! İşte daha fazla ayrıntı ve zenginleştirilmiş bir README dosyası:

# Beymen Mobil Uygulaması Otomasyon Testleri

Bu proje, Beymen Mobil Uygulaması'nın otomasyon testlerini gerçekleştirmek için geliştirilmiştir. Uygulamayı test etmek için Java ve Selenium tabanlı bir Appium test çerçevesi kullanılmıştır.

<p align="center">
  <img src="https://url-to-your-project-logo.png" alt="Proje Logo" width="300" />
</p>

## Gereksinimler

- Java Development Kit (JDK) 1.8 veya üstü
- Maven
- IntelliJ IDEA (veya tercih ettiğiniz bir Java IDE)
- Appium
- Android Emülatörü veya Fiziksel Android Cihaz

## Proje Yapısı

Proje, BDD (Behavior-Driven Development) yaklaşımı kullanılarak Cucumber senaryoları ile tasarlanmıştır. Proje yapısı aşağıdaki gibidir:

```
├── src
│   ├── main
│   │   └── java
│   │       └── com
│   │           └── example
│   │               ├── pages
│   │               │   ├── HomePage.java
│   │               │   └── ProfilePage.java
│   │               ├── tests
│   │               │   └── StepDefinitions.java
│   │               └── utils
│   │                   ├── DriverManager.java
│   │                   └── ConfigReader.java
│   └── test
│       └── resources
│           ├── features
│           │   ├── accountVerify.feature
│           │   └── adressVerify.feature
│           └── app
│               └── BeymenApp.apk
└── pom.xml
```

## Kurulum

1. Bu projeyi GitHub'dan indirin veya klonlayın.

2. Proje klasörüne gidin ve gerekli bağımlılıkları yüklemek için aşağıdaki komutu çalıştırın:
   ```
   mvn clean install
   ```

3. Uygulama testlerini çalıştırmak için Appium sunucusunu başlatın ve Android Emülatörünü veya Fiziksel Cihazı hazırlayın.

4. `ConfigReader.java` dosyasında yer alan `deviceName`, `platformName`, `platformVersion`, ve `appPath` değişkenlerini kendi cihaz ve uygulama bilgilerinize göre güncelleyin.

5. Testleri çalıştırmak için aşağıdaki komutu kullanın:
   ```
   mvn test
   ```

## Senaryolar

Bu proje, iki ayrı senaryo içermektedir:

### @accountVerify

**Senaryo 1: Beymen Mobil Uygulaması ile Üye Olma Otomasyonu**
- Konum etkinleştirilir.
- Profilim butonuna tiklanır.
- Uye ol butonuna tiklanır.
- Eposta adresi yazılır.
- Şifre yazılır.
- Giris yap butonuna tiklanır.
- Profilim butonuna tiklanır.
- Doğru e-posta ile doğru hesaba girişin verify edilir.

### @adressVerify

**Senaryo 2: Beymen Mobil Uygulaması ile Kayıtlı Adresi Verify Etme**
- Konum etkinleştirilir.
- Profilim butonuna tiklanır.
- Uye ol butonuna tiklanır.
- Eposta adresi yazılır.
- Şifre yazılır.
- Giris yap butonuna tiklanır.
- Profilim butonuna tiklanır.
- Adreslerim butonuna tiklanır.
- Yeni adres ekle butonuna tiklanır.
- Adres bilgileri girilir.
- Menu sayfasına gidilir.
- Ana sayfaya gidilir.
- Kategoriler butonuna tiklanır.
- Erkek alanına tiklanır.
- Yeni gelenler kategorisine tiklanır.
- Ürün seçilir ve sepete eklenir.
- Sepet sayfasına gidilir.
- Ürün satın alınır.
- Satın alma sayfasında adres verify edilir.
- Sepet sayfasına dönülür.
- Yeni gelenler sayfasına dönülür.
- Kategoriler sayfasına dönülür.
- Profilim butonuna tiklanır.
- Adreslerim butonuna tiklanır.
- Eklenen adres silinir.

## Test Raporları

Her test çalıştırıldığında, test raporları `target/cucumber-reports/index.html` dosyasında oluşturulur. Raporları bu dosya üzerinden görüntüleyebilirsiniz.

## Lisans

Bu proje açık kaynaklıdır ve [Lisans Dosyası](LICENSE) içinde belirtilen lisans koşullarına tabidir.

## İletişim

Herhangi bir soru veya öneriniz için lütfen bize ulaşın: [farslan0699@gmail.com]

## Katkı Sağlama

Eğer projeye katkıda bulunmak isterseniz, "Pull Request" açarak değişikliklerinizi gönderebilirsiniz. Ayrıca, projenin geliştirilmesine yardımcı olmak için varolan "Issue"ları gözden geçirebilir ve geri bildirim sağlayabilirsiniz.

---

Bu daha detaylı README dosyası, projenin yapısı, test senaryoları, kurulum ve katkı sağlama süreçlerine daha fazla bilgi ekleyerek zenginleştirilmiştir. Aynı zamanda, test raporları hakkında bilgi verilmiş ve katkı sağlama süreci açıklanmıştır. Bu sayede proje kullanıcıları ve katkıda bulunanlar için daha kapsamlı bir rehberlik sağlanmıştır.
