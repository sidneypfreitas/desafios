package desafio.dribbble.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Shot
{
    private long id;
    private String title;
    private String description;
    private int width;
    private int height;
    private Images images;
    private long views_count;
    private long likes_count;
    private long buckets_count;
    private Date created_at;
    private User user;

    public long getId()
    {
        return id;
    }

    public String getTitle()
    {
        return title;
    }

    public String getDescription()
    {
        return description;
    }

    public int getWidth()
    {
        return width;
    }

    public int getHeight()
    {
        return height;
    }

    public Images getImages()
    {
        return images;
    }

    public long getViews_count()
    {
        return views_count;
    }

    public long getLikes_count()
    {
        return likes_count;
    }

    public Date getCreated_at()
    {
        return created_at;
    }

    public User getUser()
    {
        return user;
    }

    public long getBuckets_count()
    {
        return buckets_count;
    }

    @Override
    public String toString()
    {
        return "Shot [id=" + id + ", title=" + title + ", width=" + width + ", height="
                + height + ", images=" + images + ", views_count=" + views_count + ", likes_count=" + likes_count
                + ", created_at=" + created_at + ", user=" + user + "]";
    }
}
