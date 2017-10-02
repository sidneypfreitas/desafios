package desafio.dribbble.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Favorite
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private long shotId;
    private Date created_at;

    public long getShotId()
    {
        return shotId;
    }

    public void setShotId(long shotId)
    {
        this.shotId = shotId;
    }

    public Date getCreated_at()
    {
        return created_at;
    }

    public void setCreated_at(Date created_at)
    {
        this.created_at = created_at;
    }
}
