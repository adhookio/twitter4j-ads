package twitter4jads.models.ads.cards;

import com.google.gson.annotations.SerializedName;

/**
 * User: prashant
 * Date: 08/09/16.
 * Time: 1:41 AM
 */
public class TwitterVideoConversationCard extends AbstractConversationCard {

    @SerializedName("media_url")
    private String mediaUrl;

    @SerializedName("content_duration_seconds")
    private String duration;

    @SerializedName("poster_media_url")
    private String posterMediaUrl;

    @SerializedName("media_key")
    private String mediaKey;

    public String getMediaUrl() {
        return mediaUrl;
    }

    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getPosterMediaUrl() {
        return posterMediaUrl;
    }

    public void setPosterMediaUrl(String posterMediaUrl) {
        this.posterMediaUrl = posterMediaUrl;
    }

    public String getMediaKey() {
        return mediaKey;
    }

    public void setMediaKey(String mediaKey) {
        this.mediaKey = mediaKey;
    }
}
