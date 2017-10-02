package desafio.dribbble.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import desafio.dribbble.domain.Shot;

@Service
public class DribbbleService
{
    private RestTemplate restTemplate = new RestTemplate();

    @Value("${dribbble.apiUrl}")
    private String API_URL;

    @Value("${dribbble.token}")
    private String TOKEN;

    public List<Shot> getMostPopularShots()
    {
        String url = API_URL + "shots?access_token=" + TOKEN + "&sort=views";
        ResponseEntity<Shot[]> response = restTemplate.getForEntity(url, Shot[].class);

        return Arrays.asList(response.getBody());
    }

}
