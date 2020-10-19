package org.jobsearch.api;

import feign.Feign;
import feign.gson.GsonDecoder;

public interface APIFunctions {
    static <T> T buildAPI (Class<T> clasz, String url){
        return Feign.builder().
                decoder(new GsonDecoder()).
                target(clasz, url);
    }
}
