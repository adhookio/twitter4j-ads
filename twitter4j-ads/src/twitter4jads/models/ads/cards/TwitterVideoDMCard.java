package twitter4jads.models.ads.cards;

import com.google.gson.annotations.SerializedName;

/**
 * User: abhishekanand
 * Date: 13/11/17
 * Time: 9:14 PM
 */
public class TwitterVideoDMCard extends AbstractTwitterDMCard {

    @SerializedName("media_url")
    private String mediaUrl;

    @SerializedName("video_owner_id")
    private String videoOwnerId;

    @SerializedName("media_key")
    private String mediaKey;

    @SerializedName("poster_media_url")
    private String posterMediaUrl;

    public String getMediaUrl() {
        return mediaUrl;
    }

    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    public String getVideoOwnerId() {
        return videoOwnerId;
    }

    public void setVideoOwnerId(String videoOwnerId) {
        this.videoOwnerId = videoOwnerId;
    }

    public String getMediaKey() {
        return mediaKey;
    }

    public void setMediaKey(String mediaKey) {
        this.mediaKey = mediaKey;
    }

    public String getPosterMediaUrl() {
        return posterMediaUrl;
    }

    public void setPosterMediaUrl(String posterMediaUrl) {
        this.posterMediaUrl = posterMediaUrl;
    }
}
