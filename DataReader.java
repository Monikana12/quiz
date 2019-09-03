package utility;

import java.io.*;
import java.util.Properties;

public class DataReader {

    public static void main(String[] args) {


    }

    public String readMyFile(String filepath) {
        String text;
        String a = null;

        try {
            FileReader fileReader = new FileReader("/Users/qamrunnahar/IdeaProjects/Set/src/utility/information.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((text = bufferedReader.readLine()) != null) {
                a = text;
            }
            fileReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(a);

        //filepath
        return a;
    }


    //properties

    ////// public static void main(String[] args) {
    Properties properties = new Properties();


    {
        try {
            InputStream inputStream = new FileInputStream("/Users/qamrunnahar/IdeaProjects/Set/src/utility/peopleNtech.properties");
            //// Properties.load(inputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(properties.getProperty("year"));
        System.out.println(properties.getProperty("name"));
    }
   // void --properties
  /* public void getProperties(String filepath) {
        Properties properties = new Properties();


            try {
                InputStream inputStream = new FileInputStream("/Users/qamrunnahar/IdeaProjects/Set/src/utility/peopleNtech.properties");
               ///// Properties.load(inputStream);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(properties.getProperty("year"));
            System.out.println(properties.getProperty("name"));
        }*/
    // return--properties

    public Properties getProperties(String filepath) {
        Properties properties = new Properties();


        try {
            InputStream inputStream = new FileInputStream("/Users/qamrunnahar/IdeaProjects/Set/src/utility/peopleNtech.properties");
            ///// Properties.load(inputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(properties.getProperty("year"));
        System.out.println(properties.getProperty("name"));
        return properties;
    }
    }
