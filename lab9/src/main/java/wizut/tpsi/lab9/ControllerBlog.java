/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wizut.tpsi.lab9;

import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author kacperel
 */
@Controller
public class ControllerBlog {
    @Autowired
    private BlogRepository blogrepository; 
    
    
         @RequestMapping("/")
        public String getPosts(Model model) throws SQLException 
        {
            model.addAttribute("posts", blogrepository.getAllPosts());
            return "home";
        }
    
   
    @PostMapping("/newpost")
        public String newPost(BlogPost post) throws SQLException {
            blogrepository.createPost(post);
            return "redirect:/";
        }
    
    
             @PostMapping("/remove")
    public String removePost(BlogPost post) throws SQLException {
        blogrepository.remove(post);
        return "redirect:/";
    }
    
}
