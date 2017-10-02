package desafio.dribbble.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User
{
    private long id;
    private String name;
    private String username;
    private String html_url;
    private String avatar_url;

    public long getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getUsername()
    {
        return username;
    }

    public String getHtml_url()
    {
        return html_url;
    }

    public String getAvatar_url()
    {
        return avatar_url;
    }
}
