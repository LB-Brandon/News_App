package com.brandon.news_app

import retrofit2.Call
import retrofit2.http.GET

interface NewsService {
    @GET("https://news.google.com/rss?hl=ko&gl=KR&ceid=KR:ko")
    fun mainFeed(): Call<NewsRss>
}