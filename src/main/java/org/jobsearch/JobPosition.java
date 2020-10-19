package org.jobsearch;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

public class JobPosition {
    String id;
    String type;
    String url;
    @SerializedName("create_at")
    String created;
    String company;
    @SerializedName("company_url")
    String companyUrl;
    String location;
    String title;
    String description;
    @SerializedName("how_to_apply")
    String howToApply;
    @SerializedName("company_logo")
    String companyLogo;
    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompanyUrl() {
        return companyUrl;
    }

    public void setCompanyUrl(String companyUrl) {
        this.companyUrl = companyUrl;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHowToApply() {
        return howToApply;
    }

    public void setHowToApply(String howToApply) {
        this.howToApply = howToApply;
    }

    public String getCompanyLogo() {
        return companyLogo;
    }

    public void setCompanyLogo(String companyLogo) {
        this.companyLogo = companyLogo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + Objects.hashCode(this.id);
        hash = 13 * hash + Objects.hashCode(this.type);
        hash = 13 * hash + Objects.hashCode(this.url);
        hash = 13 * hash + Objects.hashCode(this.created);
        hash = 13 * hash + Objects.hashCode(this.company);
        hash = 13 * hash + Objects.hashCode(this.companyUrl);
        hash = 13 * hash + Objects.hashCode(this.location);
        hash = 13 * hash + Objects.hashCode(this.title);
        hash = 13 * hash + Objects.hashCode(this.description);
        hash = 13 * hash + Objects.hashCode(this.howToApply);
        hash = 13 * hash + Objects.hashCode(this.companyLogo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final JobPosition other = (JobPosition) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.url, other.url)) {
            return false;
        }
        if (!Objects.equals(this.created, other.created)) {
            return false;
        }
        if (!Objects.equals(this.company, other.company)) {
            return false;
        }
        if (!Objects.equals(this.companyUrl, other.companyUrl)) {
            return false;
        }
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.howToApply, other.howToApply)) {
            return false;
        }
        if (!Objects.equals(this.companyLogo, other.companyLogo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JobPosition{" + "id=" + id + ", type=" + type + ", url=" + url + ", created=" + created + ", company=" + company + ", companyUrl=" + companyUrl + ", location=" + location + ", title=" + title + ", description=" + description + ", howToApply=" + howToApply + ", companyLogo=" + companyLogo + '}';
    }
    
    
    
}
