# E-posta Doğrulama Kodu

## Giriş

Bu proje, e-posta doğrulama sistemi sağlar. Kullanıcıların e-posta adreslerinin doğruluğunu, e-postalarına bir doğrulama kodu göndererek ve bu kodu girdiklerinde tamamlanan doğrulama süreci ile kontrol etmek üzere tasarlanmıştır.

## Özellikler

- Kullanıcının e-posta adresine doğrulama kodu gönderir.
- Kullanıcı tarafından girilen kodu doğrular.
- Güvenli ve güvenilir e-posta doğrulaması sağlar.

## Gereksinimler

Başlamadan önce, aşağıdaki gereksinimlere sahip olduğunuzdan emin olun:

- Makinenizde kurulu Java Geliştirme Kiti (JDK).
- E-posta göndermek için yapılandırılmış bir e-posta hizmet sağlayıcısı (ör. SMTP).
- E-posta gönderip almak için internet bağlantısı.

## Kurulum

1. Depoyu yerel makinenize klonlayın:
    ```sh
    git clone https://github.com/Hakan-kuru/E-mail-Verification
    ```

2. Proje dizinine gidin:
    ```sh
    cd email-verification
    ```

3. Projeyi tercih ettiğiniz IDE'de (ör. NetBeans, IntelliJ IDEA) açın.

## Yapılandırma

1. `SendMail.java` dosyasındaki e-posta hizmet sağlayıcı ayarlarınızı yapılandırın. Aşağıdaki alanları e-posta hizmeti detaylarınızla güncelleyin:
    ```java
    private static final String USERNAME = "your_email@example.com"; // Kullanıcı adı burada belirtilmelidir.
    private static final String PASSWORD = "your_password"; // Şifre burada belirtilmelidir.
    /* (...) */
    // SMTP sunucusu ayarları
    Properties props = new Properties();
    props.put("mail.smtp.host", "smtp.gmail.com"); // SMTP sunucunuz
    props.put("mail.smtp.port", "587"); // SMTP portu
    props.put("mail.smtp.auth", "true");
    props.put("mail.smtp.starttls.enable", "true"); // TLS kullanımını etkinleştirin
    ```

    **Not**: Kullanıcı adı ve şifre kısımlarını kendinize göre yapılandırmayı unutmayın.

2. `Main.java` dosyasındaki `recipientEmail` değişkenini alıcının e-posta adresiyle güncelleyin:
    ```java
    String recipientEmail = "recipient@example.com";
    ```

## Kullanım

1. E-posta doğrulama sürecini başlatmak için `Main.java` dosyasını çalıştırın.

2. Uygulama, yapılandırmada belirtilen e-posta adresine bir doğrulama kodu gönderecektir.

3. Doğrulama işlemini tamamlamak için istenilen doğrulama kodunu girin.

## Kod Yapısı

- `Main.java`: Uygulamanın ana giriş noktası.
- `EmailService.java`: E-posta gönderme yöntemlerini içerir.
- `VerificationCodeGenerator.java`: Doğrulama kodlarını oluşturma ve doğrulama yöntemlerini içerir.

## Sorun Giderme

- **a problem has occured...**: E-posta hizmet sağlayıcı ayarlarınızı kontrol edin ve doğru olduklarından emin olun.
- **wrong code... try again**: Girilen kodun e-postanıza gönderilenle eşleştiğinden emin olun.

## Katkıda Bulunma

Bu projeye katkıda bulunmak için aşağıdaki adımları izleyin:

1. Bu depoyu forklayın.
2. Yeni bir dal oluşturun: `git checkout -b feature-branch-name`
3. Değişikliklerinizi yapın ve bu değişiklikleri commit edin: `git commit -m 'Add some feature'`
4. Orijinal dala push edin: `git push origin feature-branch-name`
5. Bir pull request oluşturun.

## İletişim

Benimle iletişime geçmek isterseniz, <hakan.kuru345@gmail.com> adresinden ulaşabilirsiniz.
