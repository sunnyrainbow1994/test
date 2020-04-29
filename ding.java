import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
 
 
public class ChatbotSend {
 
    public static String WEBHOOK_TOKEN ="https://oapi.dingtalk.com/robot/send?access_token=e0ea378815d707db844cfa3edf4efdc6b35ce68f7d2821707389b1c760e64bb3";
 
    public static void main(String args[])throws Exception{
 
        HttpClient httpclient = HttpClients.createDefault();
 
        HttpPost httppost =newHttpPost(WEBHOOK_TOKEN);
        httppost.addHeader("Content-Type","application/json; charset=utf-8");
 
        String textMsg ="{ "msgtype": "text", "text": {"content": "我就是我, 是不一样的烟火"}}";
        String Entity se =newStringEntity(textMsg,"utf-8");
        httppost.setEntity(se);
 
        HttpResponse response = httpclient.exe cute(httppost);
        if(response.getStatusLine().getStatusCode()== HttpStatus.SC_OK){
            String result= EntityUtils.toString(response.getEntity(),"utf-8");
            system.out.println(result);
        }
    }
}
