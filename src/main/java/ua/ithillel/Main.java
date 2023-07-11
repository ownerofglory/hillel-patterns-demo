package ua.ithillel;


import com.fasterxml.jackson.databind.ObjectMapper;
import ua.ithillel.builder.MyClient;
import ua.ithillel.chain.*;
import ua.ithillel.drink.client.CocktailDbClient;
import ua.ithillel.drink.client.DrinkClient;
import ua.ithillel.drink.model.Drink;
import ua.ithillel.drink.service.DrinkService;
import ua.ithillel.drink.service.DrinkServiceDefault;
import ua.ithillel.factory.Logistics;
import ua.ithillel.factory.LogisticsType;
import ua.ithillel.memento.TextDocument;
import ua.ithillel.pattern.proxy.CacheHandler;
import ua.ithillel.singleton.MyConnection;
import ua.ithillel.singleton.services.ProductService;
import ua.ithillel.singleton.services.UserService;

import java.io.*;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.net.http.HttpClient;
import java.time.LocalDateTime;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        // FIXME: memento demo
        TextDocument textDocument = new TextDocument();
        textDocument.setTitle("Hillel Lection 1");
        textDocument.setContent("Lection content blah blah");
        textDocument.setDate(LocalDateTime.now());

        textDocument.persist();

        textDocument.setContent(textDocument.getContent() + "\n new Line");
        textDocument.persist();

        textDocument.setContent("derfrefeee4re");
        textDocument.persist();

        textDocument.getChangeHistory().undo();


        // FIXME: chain of responsibility
//        Handler handler = new DefaultHandler();
//
//        Filter loggingFilter = new LoggingFilter();
//        Filter authFilter = new AuthFilter();
//        loggingFilter.setNext(authFilter);
//        Server server = new MyServer(handler, loggingFilter);
//
//        Request request = new Request();
//        request.setData("Hello");
//        Response response = new Response();
//
//        Request notFoundReq = new Request();
//        notFoundReq.setData("sdjlsdj");
//
//        Response response1 = new Response();
//
//        server.server(request, response);
//        server.server(notFoundReq, response1);
//
//        System.out.println(request);
//        System.out.println(notFoundReq);
//        System.out.println(response);
//        System.out.println(response1);
//
//        System.out.printf("");

        // FIXME: proxy demo
//        try {
//            DrinkClient client = new CocktailDbClient(HttpClient.newHttpClient(), new ObjectMapper());
//
//            DrinkClient proxyInstance = (DrinkClient) Proxy.newProxyInstance(Main.class.getClassLoader(), new Class[]{
//                    DrinkClient.class
//            }, new CacheHandler(client));
//
//            DrinkService service = new DrinkServiceDefault(proxyInstance);
//        } catch (Exception e) {}

        // FIXME: adapter and decorator demo
//        try (InputStream in = new FileInputStream("file.txt");
//             BufferedInputStream bin = new BufferedInputStream(in);
//
//            Reader rd = new InputStreamReader(bin);
//            BufferedReader brd = new BufferedReader(rd);
//        ) {
//
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

      // FIXME: factory method demo

//        Logistics seaTransport = Logistics.createTransport(LogisticsType.SEA);
//
//        Logistics transport = Logistics.createTransport(LogisticsType.ROAD);
//
//        ExecutorService executorService = Executors.newFixedThreadPool(3);
//
//        ExecutorService executorService1 = Executors.newCachedThreadPool();

       // FIXME: prototype
//        TextDocument textDocument = new TextDocument();
//        textDocument.setTitle("Hillel Lection 1");
//        textDocument.setContent("Lection content blah blah");
//        textDocument.setDate(LocalDateTime.now());
//
//        TextDocument clone = textDocument.clone();

//        TextDocument copy = new TextDocument();
//        copy.setTitle(textDocument.getTitle());
//        copy.setContent(textDocument.getContent());


        // FIXME: builder demo
        //MyClient myClient = new MyClient("/hello", "https", "HTTP", "2.0");
//        MyClient build = MyClient.getBuilder()
//                .setBaseUrl("/hello")
//                .build();
//
//        MyClient http = MyClient.getBuilder()
//                .setProtocol("HTTP")
//                .setVersion("2.0").build();
//
//        MyClient build1 = MyClient.getBuilder()
//                .setVersion("1.1")
//                .setBaseUrl("/product")
//                .setSchema("https")
//                .setProtocol("HTTP")
//                .build();


        // FIXME: Singleton demo
//        MyConnection connection = MyConnection.getConnection();
//
//        UserService userService = new UserService(connection);
//
//        // other part
//
//        MyConnection connection1 = MyConnection.getConnection();
//        ProductService productService = new ProductService(connection);
//
//
//
//        System.out.println("Hello world!");
    }
}