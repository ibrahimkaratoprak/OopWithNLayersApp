# OOPwithNLayersApp

Bu repository, Java 8 ve SDK 16 kullanılarak geliştirilmiş basit bir katmanlı mimariye sahip Java uygulamasını içermektedir.

## Kullanım

Uygulamayı çalıştırmak için aşağıdaki adımları izleyebilirsiniz:

1. Projeyi bilgisayarınıza klonlayın veya indirin.
2. Java 8 ve SDK 16'yı yükleyin.
3. Bağımlılıkları çözerek projeyi derleyin.
4. Uygulamayı, `Main` sınıfını çalıştırarak başlatın.

## Katmanlar

Uygulama, aşağıdaki katmanlara sahiptir:

- **business**: İş mantığı katmanını temsil eden `ProductManager` sınıfını içerir.
- **core/logging**: Loglama işlemleri için `DatabaseLogger`, `FileLogger` ve `MailLogger` sınıflarını içerir.
- **dataAccess**: Veri erişim katmanını temsil eden `HibernateProductDao` sınıfını içerir.
- **entities**: Veri nesnelerini temsil eden `Product` sınıfını içerir.

## Contributing

Bu repository, basit bir örnek uygulama sağlamak için tasarlanmıştır. Eğer projeye katkıda bulunmak veya iyileştirmeler yapmak isterseniz, pull request gönderebilirsiniz.

## License

Bu repository MIT Lisansı altında lisanslanmıştır. Detaylar için [LICENSE dosyasına](LICENSE) bakabilirsiniz.
