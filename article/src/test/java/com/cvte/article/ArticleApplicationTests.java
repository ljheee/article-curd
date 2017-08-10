package com.cvte.article;

import com.cvte.article.controller.ArticleController;
import com.cvte.article.entity.Article;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockSessionCookieConfig;
import org.springframework.test.context.junit4.SpringRunner;


import org.junit.Before;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.math.BigInteger;
import java.util.List;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

//@SpringApplicationConfiguration(classes = MockSessionCookieConfig.class)
@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class ArticleApplicationTests {

	private MockMvc mvc;

	@Autowired
	private ArticleController articleController;

	@Before
	public void setUp() throws Exception {
		mvc = MockMvcBuilders.standaloneSetup(new ArticleController()).build();
	}

	@Test
	public void testArticleController() throws Exception {
		RequestBuilder request = null;
/*
		// 1、get查一下user列表，应该为空
		request = get("/articles/");
		mvc.perform(request)
				.andExpect(status().isOk())
				.andExpect(content().string(equalTo("[]")));

		// 2、post提交一个article
		request = post("/articles")
				.param("id", "1")
				.param("title", "title1")
				.param("content", "content1")
				.param("createdTime", "111111111111")
				.param("updatedTime", "222222222222")
				.param("isDel", "false");
		mvc.perform(request)
				.andExpect(content().string(equalTo("success")));

		// 4、put修改id为1的
		request = put("/articles/id=1")
				.param("id", "1")
				.param("title", "title1")
				.param("content", "content1")
				.param("createdTime", "1111111111119")
				.param("updatedTime", "2222222222229")
				.param("isDel", "false");
		mvc.perform(request)
				.andExpect(content().string(equalTo("success")));

		// 5、get一个id为1的
		request = get("/articles/id=1");
		mvc.perform(request)
				.andExpect(content().string(equalTo("{\"id\":1,\"title\":\"title1\",\"content\":\"content1\",\"createdTime\":111111111111,\"updatedTime\":222222222222,\"del\":false}")));

		// 6、del删除id为1的user
		request = delete("/articles/id=1");
		mvc.perform(request)
				.andExpect(content().string(equalTo("success")));


*/


//		List<Article>dataList = articleController.getArticleList();
//		System.out.print(dataList.get(0));
//		articleController.postArticle("title","content",new BigInteger("11111"),new BigInteger("11111"),false);

//		System.out.println(articleController.getArticle(1));

		articleController.putArticle(1,new Article(1,"title", "contentNew", new BigInteger("11111"), new BigInteger("11111"), false));
	}


}
