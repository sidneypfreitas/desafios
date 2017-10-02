package desafio.dribbble.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Images
{
    private String normal;
    private String teaser;

    public String getNormal()
    {
        return normal;
    }

    public String getTeaser()
    {
        return teaser;
    }
}