package com.goodreads.controller;


import com.goodreads.model.Book;
import com.goodreads.model.BookDetailResponse;
import com.goodreads.model.SearchResponse;
import com.goodreads.model.Work;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/goodreads-service/api")
public class GoodreadsController {

    @GetMapping(produces = "application/json", value="searchBook")
    public List<Work> getSearchResponse(@RequestParam("searchType") String searchType,
                                        @RequestParam("searchText") String query){

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl("https://www.goodreads.com/search/index.xml")
           
                .queryParam("key", "KDjoJg9Jf65zeGGx2chDMw")
                .queryParam("q", query)
                .queryParam("search", searchType);

        RestTemplate restTemplate = new RestTemplate();
        SearchResponse response = restTemplate.getForObject
                (builder.build().encode().toUri(), SearchResponse.class);
        return response.getSearch().getWorks();
    }

    @GetMapping(produces = "application/json", value="book")
    public Book getSearchResponse(@RequestParam("id") int id){
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl("https://www.goodreads.com/book/show.xml")
                .queryParam("key", "KDjoJg9Jf65zeGGx2chDMw")
                .queryParam("id", id);

        RestTemplate restTemplate = new RestTemplate();
        BookDetailResponse bookResponse = restTemplate.getForObject
                (builder.build().encode().toUri(), BookDetailResponse.class);
        return bookResponse.getBook();
    }

}
