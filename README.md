# Hastane Planlama Sistemi

Bu proje, Nesneye Yönelik Programlama (OOP) dersi için hazırlanmış bir hastane yönetim ve hasta önceliklendirme simülasyonudur.

**Kullanılan OOP Prensipleri:**
* Kapsülleme (Encapsulation), Kalıtım (Inheritance), Soyutlama (Abstraction), Çok Biçimlilik (Polymorphism)

**Kullanılan Tasarım Kalıpları:**
* **Factory Pattern:** Hasta nesnelerinin (Acil/Normal) dinamik üretimi için kullanıldı.
* **Strategy Pattern:** Hastaların aciliyet skoruna göre sıralanması algoritmasında kullanıldı.

**SOLID Prensipleri:**
* **SRP & DIP:** Dosya kayıt işlemleri soyutlanarak `IVeriKayit` arayüzü ve `DosyaIslemleri` sınıfına devredildi.
* **OCP & LSP:** Yeni hasta tipleri eklenebilecek ve mevcut sınıfların yerine geçebilecek şekilde hiyerarşi kuruldu.

**Proje Takımı:**
* Mehmet Berke ÜNLÜTÜRK - 1250505051 - Görev: Mimari ve Algoritma
* Melih Kaya - 5250505034 - Görev: Veri Yönetimi, Test ve Dokümantasyon

* Not: Testleri çalıştırabilmek için geliştirme ortamına (IDE) JUnit 5 (org.junit.jupiter) kütüphanesinin dahil edilmesi gerekmektedir.
