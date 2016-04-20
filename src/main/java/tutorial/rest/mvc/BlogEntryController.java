package tutorial.rest.mvc;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import tutorial.mvc.entries.BlogEntry;

/**
 * Created by jsidhu on 19/04/16.
 */
@Controller
public class BlogEntryController {
    @RequestMapping("/test")
    public ResponseEntity<Object> test(){
        BlogEntry blogEntry=new BlogEntry();
        blogEntry.setTitle("First Blog Entry");
        return new ResponseEntity<Object>(blogEntry, HttpStatus.OK);

    }


}
