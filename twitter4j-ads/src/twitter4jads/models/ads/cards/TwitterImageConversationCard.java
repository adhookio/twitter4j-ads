package twitter4jads.models.ads.cards;

import com.google.gson.annotations.SerializedName;

/**
 * User: prashant
 * Date: 08/09/16.
 * Time: 1:38 AM
 */
public class TwitterImageConversationCard extends AbstractConversationCard {

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
