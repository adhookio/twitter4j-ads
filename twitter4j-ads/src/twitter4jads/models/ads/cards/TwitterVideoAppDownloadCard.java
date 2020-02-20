package twitter4jads.models.ads.cards;

import com.google.gson.annotations.SerializedName;

/**
 * User: prashant
 * Date: 27/08/15
 */
public class TwitterVideoAppDownloadCard extends AbstractAppCard {
    @SerializedName("media_key")
    private String mediaKey;

    @SerializedName("media_url")
    private String mediaUrl;

    @SerializedName("content_duration_seconds")
    private String channelVideoLength;

    @SerializedName("image_media_id")
    private String channelImageId;

    public String getMediaKey() {
        return mediaKey;
    }

    public void setMediaKey(String mediaKey) {
        this.mediaKey = mediaKey;
    }

    public String getMediaUrl() {
        return mediaUrl;
    }

    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    public String getChannelVideoLength() {
        return channelVideoLength;
    }

    public void setChannelVideoLength(String channelVideoLength) {
        this.channelVideoLength = channelVideoLength;
    }

    public String getChannelImageId() {
        return channelImageId;
    }

    public void setChannelImageId(String channelImageId) {
        this.channelImageId = channelImageId;
    }

    public String getPosterMediaUrl() {
        return posterMediaUrl;
    }

    public void setPosterMediaUrl(String posterMediaUrl) {
        this.posterMediaUrl = posterMediaUrl;
    }

    @SerializedName("poster_media_url")
    private String posterMediaUrl;
}
