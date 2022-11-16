package ru.netology.cloudstorage.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import ru.netology.cloudstorage.service.FileService;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest(classes = {FileController.class, FileService.class})
@WebAppConfiguration
@ExtendWith(MockitoExtension.class)
@WithMockUser(username = "user")
@AutoConfigureMockMvc
class FileControllerTest {

    @Autowired
    WebApplicationContext webApplicationContext;

    @MockBean
    private FileService fileService;

    @InjectMocks
    private FileController fileController;

    protected MockMvc mvc;

//    @BeforeEach
//    void setUp() {
//        mvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
//    }

//    @Test
//    void listFile() throws Exception {
//        //   List<FileDTO> allByUser = fileController.listFile("3");
//
//        String uri = "/list";
//        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
//                .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
//
//        int status = mvcResult.getResponse().getStatus();
//        assertEquals(200, status);
//        String content = mvcResult.getResponse().getContentAsString();
////        Product[] productlist = super.mapFromJson(content, Product[].class);
////        assertTrue(productlist.length > 0);
//    }

    @Test
    void uploadFile() {
    }

    @Test
    void deleteFile() {
    }

    @Test
    void getFile() {
    }

    @Test
    void updateFile() {
    }
}