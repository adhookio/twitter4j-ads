package twitter4jads.models.ads.cards;

import com.google.gson.annotations.SerializedName;

/**
 * User:  abhishekanand
 * Date:  28/08/17
 * Time:  11:31 AM
 */
public class TwitterVideoWebsiteCard extends AbstractTwitterCard {

    @SerializedName("title")
    private String title;

    @SerializedName("media_key")
    private String mediaKey;

    @SerializedName("website_url")
    private String websiteUrl;

    @SerializedName("media_url")
    private String mediaUrl;

    @SerializedName("poster_media_url")
    private String posterMediaUrl;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMediaKey() {
        return mediaKey;
    }

    public void setMediaKey(String mediaKey) {
        this.mediaKey = mediaKey;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public String getMediaUrl() {
        return mediaUrl;
    }

    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    public String getPosterMediaUrl() {
        return posterMediaUrl;
    }

    @SuppressWarnings("unused")
    public void setPosterMediaUrl(String posterMediaUrl) {
        this.posterMediaUrl = posterMediaUrl;
    }
}
