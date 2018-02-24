package common;

import java.util.List;

/**
 * Created by xinjian.ye on 2017/12/21.
 */
public class Company {

    String companyName;
    List<Artist> artists;

    public Company(String companyName, List<Artist> artists) {
        this.companyName = companyName;
        this.artists = artists;
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
