package twitter4jads.impl;

import com.google.gson.annotations.SerializedName;
import twitter4jads.models.ads.audience.CustomAudienceUserDetails;

import java.util.Set;

/**
 * Twitter V5 Audience API params structure User: mayankbhargava
 *
 * @date 25/11/18
 * @time 10:03 PM
 */
class NewAdsAudienceApiParams {

    @SerializedName("users")
    private Set<CustomAudienceUserDetails> customAudienceUserDetails;

    @SerializedName("effective_at")
    private String effectiveAt;     //in ISO 8601

    @SerializedName("expires_at")
    private String expiresAt;        //in ISO 8601

    public Set<CustomAudienceUserDetails> getCustomAudienceUserDetails() {
        return customAudienceUserDetails;
    }

    public void setCustomAudienceUserDetails(Set<CustomAudienceUserDetails> customAudienceUserDetails) {
        this.customAudienceUserDetails = customAudienceUserDetails;
    }

    public String getEffectiveAt() {
        return effectiveAt;
    }

    public void setEffectiveAt(String effectiveAt) {
        this.effectiveAt = effectiveAt;
    }

    public String getExpireAt() {
        return expiresAt;
    }

    public void setExpireAt(String expireAt) {
        this.expiresAt = expireAt;
    }
}
