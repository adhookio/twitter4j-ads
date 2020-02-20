package twitter4jads.models.ads.cards;

import com.google.gson.annotations.SerializedName;

/**
 * User:  dheeraj
 * Date:  09/11/17.
 */
public class TwitterImageDMCard extends AbstractTwitterDMCard {

    @SerializedName("media_url")
    private String mediaUrl;

    @SerializedName("media_key")
    private String mediaKey;

    public String getMediaUrl() {
        return mediaUrl;
    }

    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    public String getMediaKey() {
        return mediaKey;
    }

    public void setMediaKey(String mediaKey) {
        this.mediaKey = mediaKey;
    }
}
