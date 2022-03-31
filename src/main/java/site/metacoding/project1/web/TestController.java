package site.metacoding.project1.web;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    @GetMapping("/kind/dog")
    public String kindDownDog() {

        try {
            String key = "jDqHGG%2BaNG47ijh6s3XzB%2BuF8fJOeovccnw%2FZtc9wLQUaKJumPo%2Frl1a2ygZ68dv9L0PD7drvpjPAeTnnB9f%2FQ%3D%3D";
            URI uri = new URI(
                    "http://apis.data.go.kr/1543061/abandonmentPublicSrvc/kind?serviceKey="
                            + key
                            + "&up_kind_cd=417000&_type=json");
            RestTemplate restTemplate = new RestTemplate();

            String response = restTemplate.getForObject(uri, String.class);

            System.out.println(response);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return null;
    }

    @GetMapping("/kind/cat")
    public String kindDownCat() {

        try {
            String key = "jDqHGG%2BaNG47ijh6s3XzB%2BuF8fJOeovccnw%2FZtc9wLQUaKJumPo%2Frl1a2ygZ68dv9L0PD7drvpjPAeTnnB9f%2FQ%3D%3D";
            URI uri = new URI(
                    "http://apis.data.go.kr/1543061/abandonmentPublicSrvc/kind?serviceKey="
                            + key
                            + "&up_kind_cd=422400&_type=json");
            RestTemplate restTemplate = new RestTemplate();

            String response = restTemplate.getForObject(uri, String.class);

            System.out.println(response);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return null;

    }

    @GetMapping("/sigungu")
    public String sigungu() {

        try {
            String key = "jDqHGG%2BaNG47ijh6s3XzB%2BuF8fJOeovccnw%2FZtc9wLQUaKJumPo%2Frl1a2ygZ68dv9L0PD7drvpjPAeTnnB9f%2FQ%3D%3D";
            URI uri = new URI(
                    "http://apis.data.go.kr/1543061/abandonmentPublicSrvc/sigungu?serviceKey=" + key
                            + "&upr_cd=6110000&_type=json");
            RestTemplate restTemplate = new RestTemplate();

            String response = restTemplate.getForObject(uri, String.class);

            System.out.println(response);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return null;

    }

    @GetMapping("/sido")
    public String sido() {

        try {
            String key = "jDqHGG%2BaNG47ijh6s3XzB%2BuF8fJOeovccnw%2FZtc9wLQUaKJumPo%2Frl1a2ygZ68dv9L0PD7drvpjPAeTnnB9f%2FQ%3D%3D";
            URI uri = new URI(
                    "http://apis.data.go.kr/1543061/abandonmentPublicSrvc/sido?serviceKey=" + key
                            + "&numOfRows=3&pageNo=1&_type=json");
            RestTemplate restTemplate = new RestTemplate();

            String response = restTemplate.getForObject(uri, String.class);

            System.out.println(response);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return null;

    }

    @GetMapping("/house")
    public String house() {

        try {
            String key = "jDqHGG%2BaNG47ijh6s3XzB%2BuF8fJOeovccnw%2FZtc9wLQUaKJumPo%2Frl1a2ygZ68dv9L0PD7drvpjPAeTnnB9f%2FQ%3D%3D";
            URI uri = new URI(
                    "http://apis.data.go.kr/1543061/abandonmentPublicSrvc/shelter?serviceKey=" + key
                            + "&upr_cd=6110000&org_cd=3220000&_type=json");
            RestTemplate restTemplate = new RestTemplate();

            String response = restTemplate.getForObject(uri, String.class);

            System.out.println(response);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return null;

    }

    @GetMapping("/all")
    public String all() {

        try {
            String key = "jDqHGG%2BaNG47ijh6s3XzB%2BuF8fJOeovccnw%2FZtc9wLQUaKJumPo%2Frl1a2ygZ68dv9L0PD7drvpjPAeTnnB9f%2FQ%3D%3D";
            URI uri = new URI(
                    "http://apis.data.go.kr/1543061/abandonmentPublicSrvc/abandonmentPublic?bgnde=20220101&endde=20220330&pageNo=1&numOfRows=10&serviceKey="
                            + key + "&_type=json");
            RestTemplate restTemplate = new RestTemplate();

            String response = restTemplate.getForObject(uri, String.class);

            System.out.println(response);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return null;

    }
}