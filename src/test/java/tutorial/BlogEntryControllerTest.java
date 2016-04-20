package tutorial;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import tutorial.mvc.BlogEntryController;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;



/**
 * Created by jsidhu on 19/04/16.
 */
public class BlogEntryControllerTest {

    @Mock
    private BlogEntryController blogEntryController;

    private MockMvc mockMvc;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
        mockMvc= MockMvcBuilders.standaloneSetup(blogEntryController).build();
    }

    @Test
    public void test() throws  Exception{
        mockMvc.perform(get("/test")).andDo(print());
    }

}
