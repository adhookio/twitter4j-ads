package twitter4jads.models.ads.cards;

import com.google.gson.annotations.SerializedName;

/**
 * @author meghanajain
 */
public class TwitterImageAppDownloadCard extends AbstractAppCard{

    @SerializedName("media_url")
    private String mediaUrl;

    @SerializedName("media_key")
    private String mediaKey;

    @SerializedName("wide_app_image_data")
    private String wideAppImageData;

    public String getMediaUrl() {
        return mediaUrl;
    }

    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    public String getWideAppImageData() {
        return wideAppImageData;
    }

    public void setWideAppImageData(String wideAppImageData) {
        this.wideAppImageData = wideAppImageData;
    }

    public String getMediaKey() {
        return mediaKey;
    }

    public void setMediaKey(String mediaKey) {
        this.mediaKey = mediaKey;
    }
}
