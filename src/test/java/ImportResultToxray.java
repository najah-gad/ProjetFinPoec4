import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContexts;
import org.apache.http.util.EntityUtils;
import javax.net.ssl.SSLContext;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

public class ImportResultToxray {
    String token ="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ0ZW5hbnQiOiJiNmNhZGQwNS1lMzQxLTNmMTctYjU1Zi00OTM0MTI4MWQ4MmEiLCJhY2NvdW50SWQiOiI2MzYyMmE1YWY3YWQ3MjFlNzg0ZjhkNGEiLCJpc1hlYSI6ZmFsc2UsImlhdCI6MTY3NDEyMDUxMCwiZXhwIjoxNjc0MjA2OTEwLCJhdWQiOiI5RkYyQjg5MzM4Nzg0MEQ5ODEyMjEzRTY2NjA0NTI0MSIsImlzcyI6ImNvbS54cGFuZGl0LnBsdWdpbnMueHJheSIsInN1YiI6IjlGRjJCODkzMzg3ODQwRDk4MTIyMTNFNjY2MDQ1MjQxIn0.NR--ZYVpBcczVz_C0Mlynbnm6OKOMnI5enMcnuRKPdE";
    public void RemonteResultats() throws NoSuchAlgorithmException, KeyStoreException, KeyManagementException, IOException, InterruptedException {

        SSLContext sslContext = SSLContexts.custom().loadTrustMaterial((chain, authType) -> true).build();
        SSLConnectionSocketFactory sslConnectionSocketFactory = new SSLConnectionSocketFactory(sslContext, new String[]
                {"SSLv2Hello", "SSLv3", "TLSv1", "TLSv1.1", "TLSv1.2"}, null, NoopHostnameVerifier.INSTANCE);
        CloseableHttpClient httpClient = HttpClients.custom().setSSLSocketFactory(sslConnectionSocketFactory).build();
        HttpPost request2 = new HttpPost("https://xray.cloud.getxray.app/api/v2/import/execution/cucumber");

        request2.addHeader("Content-Type", "application/json");
        request2.addHeader("Authorization", "Bearer " + token);
        Thread.sleep(10000);
       System.out.println("le path =" + System.getProperty("user.dir") + "\\target\\cucumber.json");
       StringEntity params = new StringEntity(Files.readString(Path.of(System.getProperty("user.dir") + "\\target\\cucumber.json"), StandardCharsets.UTF_8));
        request2.setEntity(params);



        try (
                CloseableHttpClient httpClient2 = HttpClients.createDefault();
                CloseableHttpResponse response = httpClient.execute(request2)) {
            System.out.println("Response code: " + response.getStatusLine().getStatusCode());
            HttpEntity entity2 = response.getEntity();
            Object result2 = EntityUtils.toString(entity2);
            System.out.println(result2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
