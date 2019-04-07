package net.lihulab;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.result.StatusResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class DemoApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void contextLoads() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/hello")
				.contentType(MediaType.APPLICATION_JSON_VALUE))
				.andExpect(MockMvcResultMatchers.status().isOk());
				//.andExpect(MockMvcResultMatchers.jsonPath("$.length()").value(3));
	}

	@Test
	public void whenQuerySuccess() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/users")
				.param("username", "jojo")
				.param("age", "18")
				.param("ageTo", "60")
				.param("xxx", "yyy")
				.param("size", "15")
				.param("page", "3")
				.param("sort", "age,desc")
				.contentType(MediaType.APPLICATION_JSON_VALUE))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.jsonPath("$.length()").value(3));
	}

	@Test
	public void whenUpdateSuccess() throws Exception {
		String content = "{\"id\":\"1\", \"username\":\"tom\",\"password\":null}";
		String result = mockMvc.perform(MockMvcRequestBuilders.put("/users/1")
				.contentType(MediaType.APPLICATION_JSON_VALUE)
				.content(content))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andReturn().getResponse().getContentAsString();
		System.out.println(result);
	}

}
