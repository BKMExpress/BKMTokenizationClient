package example;

import com.bkm.BkmTokenizationService_PortType;
import com.bkm.BkmTokenizationService_ServiceLocator;
import com.bkm.TokenizationWSRequest;
import com.bkm.TokenizationWSResponse;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by myalcinsoy on 4/5/2018.
 */
public class ClientCaller {
  private static final String URL_PREPROD = "https://preprod.bkmexpress.com.tr:9621/BKMExpress/BkmTokenizationService.ws?wsdl";

  public static void main(String[] argv) {
    try {
      URL url = null;
      try {
        url = new URL(URL_PREPROD);
      } catch (MalformedURLException ex) {
        System.out.println("WS.getService Exc : " + ex);
      }

      BkmTokenizationService_ServiceLocator locator = new BkmTokenizationService_ServiceLocator();
      locator.setBkmTokenizationServicePortEndpointAddress(URL_PREPROD);
      BkmTokenizationService_PortType port = locator.getBkmTokenizationServicePort();


      TokenizationWSRequest tokenizationWSRequest = new TokenizationWSRequest();
      tokenizationWSRequest.setCardData("222");
      tokenizationWSRequest.setUniqueReferans("123axdf");
      tokenizationWSRequest.setMerchantId("1232");
      tokenizationWSRequest.setRegistrationType("2");
      tokenizationWSRequest.setTs("224234");
      tokenizationWSRequest.setS("2323423434");


      TokenizationWSResponse response = port.getToken(tokenizationWSRequest);

      System.out.print("Response : " + response.getBankResponseCode());


    } catch (javax.xml.rpc.ServiceException ex) {
      ex.printStackTrace();
    } catch (java.rmi.RemoteException ex) {
      ex.printStackTrace();
    }
  }
}
