import org.json.JSONArray;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by Naga on 13-03-2017.
 */
@WebServlet(name = "ImageService", urlPatterns = "/ImageService")
public class ImageService extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StringBuilder buffer = new StringBuilder();
        BufferedReader reader = req.getReader();
        String response="";
        String line;
        while ((line = reader.readLine()) != null) {
            buffer.append(line);
        }
        String data = buffer.toString();
        System.out.println(data);
        String output = "";
        JSONObject params = new JSONObject(data);
        JSONObject result = params.getJSONObject("result");
        JSONObject parameters = result.getJSONObject("parameters");
        if (parameters.get("cars").toString().equals("cars")) {
            JSONObject jsonObject = new JSONObject();
            JSONArray jsonArray = new JSONArray();
            jsonArray.put("http://img.autobytel.com/car-reviews/autobytel/11694-good-looking-sports-cars/2016-Ford-Mustang-GT-burnout-red-tire-smoke.jpg");
            jsonArray.put("http://cdn1.droom.in/photos/images/drm/super-cars.png");
            jsonArray.put("http://www.stylemotivation.com/wp-content/uploads/2016/08/25-cars-worth-waiting-for-lp-ford-gt-photo-658253-s-original.jpg");
            jsonArray.put("http://hd-wall-papers.com/images/wallpapers/cars/cars-1.jpg");
            jsonArray.put("http://static4.businessinsider.com/image/51364fb0eab8ea573000000d/here-are-the-10-most-beautiful-cars-money-can-buy.jpg");
            jsonArray.put("http://www.ford.com/resources/ford/general/newvehicles/Cars_Landing_Page/fiesta.jpg?v=1377238799000");
            jsonObject.put("data", jsonArray);
            output = jsonObject.toString();
            Data data_ob = Data.getInstance();
            data_ob.setData(output);
            data_ob.setFlag(true);
            JSONObject js = new JSONObject();
            js.put("speech", "cars are displayed");
            js.put("displayText", "cars are displayed");
            js.put("source", "image database");
            response = js.toString();
        }
        else if (parameters.get("cars").toString().equals("ferrari")) {
            JSONObject jsonObject = new JSONObject();
            JSONArray jsonArray = new JSONArray();
            jsonArray.put("http://buyersguide.caranddriver.com/media/assets/submodel/6873.jpg");
            jsonArray.put("http://4.bp.blogspot.com/-huC7b-kloV4/UA1vIDFt0aI/AAAAAAAAIuc/A3jdqWveQUQ/s1600/Hdhut.blogspot.com+%2812%29.jpeg");
            jsonArray.put("http://buyersguide.caranddriver.com/media/assets/submodel/7543.jpg");
            jsonArray.put("http://images.carandbike.com/car-images/big/ferrari/california/ferrari-california.jpg?v=5");
            jsonArray.put("http://buyersguide.caranddriver.com/media/assets/submodel/6866.jpg");
            jsonArray.put("https://s-media-cache-ak0.pinimg.com/originals/35/69/df/3569dfef130a6420a5c48c4bf15e0f15.jpg");
            jsonObject.put("data", jsonArray);
            output = jsonObject.toString();
            Data data_ob = Data.getInstance();
            data_ob.setData(output);
            data_ob.setFlag(true);
            JSONObject js = new JSONObject();
            js.put("speech", "ferrari cars are displayed");
            js.put("displayText", "ferrari cars are displayed");
            js.put("source", "image database");
            response = js.toString();
        }
        else if (parameters.get("cars").toString().equals("bugatti")){
            JSONObject jsonObject = new JSONObject();
            JSONArray jsonArray = new JSONArray();
            jsonArray.put("https://images.cdn.autocar.co.uk/sites/autocar.co.uk/files/styles/gallery_slide/public/bugatti-veyron-super-sport-.jpg?itok=CwYkkjOl");
            jsonArray.put("https://aos.iacpublishinglabs.com/question/aq/700px-394px/bugatti-cars_91b44b9a2b388085.jpg?domain=cx.aos.ask.com");
            jsonArray.put("http://www.thesupercars.org/wp-content/uploads/2008/09/2009-bugatti-164-veyron-fbg-par-hermes.jpg");
            jsonArray.put("http://s.hswstatic.com/gif/bugatti-8.jpg");
            jsonArray.put("https://i.ytimg.com/vi/9rLdNl2D8l0/maxresdefault.jpg");
            jsonArray.put("https://s-media-cache-ak0.pinimg.com/originals/6c/bd/93/6cbd936daa94ba5e51eff81a06b836ef.jpg");
            jsonObject.put("data", jsonArray);
            output = jsonObject.toString();
            Data data_ob = Data.getInstance();
            data_ob.setData(output);
            data_ob.setFlag(true);
            JSONObject js = new JSONObject();
            js.put("speech", "bugatti cars are displayed");
            js.put("displayText", "bugatti cars are displayed");
            js.put("source", "image database");
            response = js.toString();
        }
        else if (parameters.get("cars").toString().equals("dog")){
            JSONObject jsonObject = new JSONObject();
            JSONArray jsonArray = new JSONArray();
            jsonArray.put("http://cdn.successdogs.com/wp-content/uploads/2014/07/how-to-train-your-dog-to-come-facebook.png");
            jsonArray.put("https://s-media-cache-ak0.pinimg.com/originals/62/d2/0a/62d20a092ccd5367567ffef3dda9f37e.jpg");
            jsonArray.put("http://mardaloopdoggiedaycare.com/wp-content/uploads/2014/12/cute-dog2.jpg");
            jsonArray.put("https://otvet.imgsmail.ru/download/2dc19088b1095f5e2c4e1ac592e3a224_i-1331.jpg");
            jsonArray.put("http://www.rd.com/wp-content/uploads/sites/2/2016/01/07-dog-breeds-chow-chow.jpg");
            jsonArray.put("http://greatinspire.com/wp-content/uploads/2012/11/Cute-puppy-photos-252.jpg");
            jsonObject.put("data", jsonArray);
            output = jsonObject.toString();
            Data data_ob = Data.getInstance();
            data_ob.setData(output);
            data_ob.setFlag(true);
            JSONObject js = new JSONObject();
            js.put("speech", "dogs are displayed");
            js.put("displayText", "dogs are displayed");
            js.put("source", "image database");
            response = js.toString();
        }
        else if (parameters.get("null").toString().equals("clear")){
            Data data_ob = Data.getInstance();
            JSONObject js1 = new JSONObject();
            JSONArray jsonArray = new JSONArray();
            jsonArray.put(" ");
            js1.put("data", jsonArray);
            data_ob.setData(js1.toString());
            data_ob.setFlag(true);
            JSONObject js = new JSONObject();
            js.put("speech", "screen is cleared");
            js.put("displayText", "screen is cleared");
            js.put("source", "image database");
            response = js.toString();
        }
        resp.setHeader("Content-type", "application/json");
        resp.getWriter().write(response);
    }
}
