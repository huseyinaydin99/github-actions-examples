package tr.com.huseyinaydin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootGithubActApp {

    @GetMapping("/aytengelnurtengel")
    public String welcome(){
        return "ayten gel nurten gel, hayriye gel, huyriye gel :-D";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootGithubActApp.class, args);
    }
}

/*

echo "# github-actions-examples" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M master
git remote add origin https://github.com/huseyinaydin99/github-actions-examples.git
git push -u origin master

*/