package com.learningcamel.direct;

import org.apache.camel.builder.RouteBuilder;

public class SampleDirectRoute extends RouteBuilder {

    public void configure() throws Exception {
        from("direct:sampleInput")
                .log("Recieved Message is ${body} and Headers are ${headers}")
                .to("file:sampleOutput?fileName=output.txt");
    }

}
