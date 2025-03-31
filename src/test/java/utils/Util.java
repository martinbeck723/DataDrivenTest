package utils;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class Util {
    public static JSONObject loadJSONFile(String fileLocation, int index) throws IOException, ParseException {
        JSONParser jsonParser=new JSONParser();
        Object obj = jsonParser.parse(new FileReader(fileLocation));
        JSONArray jsonArray = (JSONArray) obj;
        return (JSONObject) jsonArray.get(index);
//        JSONObject jsonObject= (JSONObject) obj;
//        return jsonObject;
    }

    public static JSONObject loadJSONFiles(String fileLocation, int index) throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        Object obj = jsonParser.parse(new FileReader(fileLocation));
        JSONArray jsonArray = (JSONArray) obj;
        return (JSONObject) jsonArray.get(index);
    }


    public static void addJsonList(String firstName, String lastName,String empIdStr, String username,String password,String confirmPassword) throws IOException, ParseException {
        String fileName="./src/test/resources/Cred.json";
        JSONParser jsonParser = new JSONParser();
        Object obj = jsonParser.parse(new FileReader(fileName));
        JSONObject userObj = new JSONObject();
        JSONArray jsonArray = (JSONArray) obj;

        userObj.put("firstname",firstName);
        userObj.put("lastname",lastName);
        userObj.put("empIdStr",empIdStr);
        userObj.put("username",username);
        userObj.put("password",password);
        userObj.put("password",confirmPassword);


        jsonArray.add(userObj);

        FileWriter file=new FileWriter(fileName);
        file.write(jsonArray.toJSONString());
        file.flush();
        file.close();
    }
    public static void updateEmp(String fileName, String key, String value, int index) throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        Object object = jsonParser.parse(new FileReader(fileName));
        JSONArray jsonArray = (JSONArray) object;
        JSONObject jsonObject = (JSONObject) jsonArray.get(index);
        jsonObject.put(key, value);

        FileWriter file = new FileWriter(fileName);
        file.write(jsonArray.toJSONString());
        file.flush();
        file.close();
    }

    public static List readJSONArray(String filename) throws IOException, ParseException {
        JSONParser parser=new JSONParser();
        Object object= parser.parse(new FileReader(filename));
        JSONArray jsonArray= (JSONArray) object;
        return jsonArray;
    }

    public static List readJSONsArray(String filename1) throws IOException, ParseException {
        JSONParser parser=new JSONParser();
        Object object= parser.parse(new FileReader(filename1));
        JSONArray jsonArray= (JSONArray) object;
        return jsonArray;
    }



    public static void main(String[] args) throws IOException, ParseException {
        //
    }
}