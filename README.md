# BKMTokenizationClient

##NE İŞE YARAR?
> BKM'den token alma ve ödeme işlemlerinde yapılacak çağrımları kolaylaştırmak için eklenmiş Java için web client projesidir.
Projeye source kod olarak yada jar olarak eklenerek kullanılabilir.


##NASIL ÇALIŞIR?

Client kullanımı icin gerekli kod satırları :

      - BkmTokenizationService_ServiceLocator locator = new BkmTokenizationService_ServiceLocator();
      - locator.setBkmTokenizationServicePortEndpointAddress(URL_PREPROD);
      - BkmTokenizationService_PortType port = locator.getBkmTokenizationServicePort();

 sonrasında port uzerindeki servisler kullanılabilir.
 
 ClientCaller class ı incelenmelidir.

##ORTAMLAR

Endpoint olarak kullanılacak adresler bu şekildedir

   URL_PREPROD = https://preprod.bkmexpress.com.tr:9621/BKMExpress/BkmTokenizationService.ws?wsdl
   
   URL_PROD = https://www.bkmexpress.com.tr:9621/BKMExpress/BkmTokenizationService.ws?wsdl

