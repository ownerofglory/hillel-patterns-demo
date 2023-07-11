package ua.ithillel.builder;

import java.lang.invoke.MutableCallSite;

public class MyClient {
    private String baseUrl = "/";
    private String schema = "https";
    private String protocol = "HTTP";
    private String version = "1.1";

    private MyClient() {
    }

    public static MyClientBuilder getBuilder() {
        return new MyClientBuilder();
    }




    public static class MyClientBuilder {
        private MyClient client;

        public MyClientBuilder() {
            this.client = new MyClient();
        }

        public MyClientBuilder setBaseUrl(String baseUrl) {
            this.client.baseUrl = baseUrl;

            return this;
        }

        public MyClientBuilder setSchema(String schema) {
            this.client.schema = schema;

            return this;
        }

        public MyClientBuilder setProtocol(String protocol) {
            this.client.protocol = protocol;

            return this;
        }

        public MyClientBuilder setVersion(String version) {
            this.client.version = version;

            return this;
        }

        public MyClient build() {
            return client;
        }
    }

}
