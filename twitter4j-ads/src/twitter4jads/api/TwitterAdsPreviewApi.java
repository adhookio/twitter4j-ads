package twitter4jads.api;

import java.util.List;

import twitter4jads.BaseAdsListResponse;
import twitter4jads.internal.models4j.TwitterException;
import twitter4jads.models.ads.TweetType;
import twitter4jads.models.ads.TwitterCreativePreview;

/**
 * User: abhishek.chatrath
 * Date: 13/06/16.
 * Time: 8:08 PM
 */
public interface TwitterAdsPreviewApi {

    /**
     * Sends a GET request to Twitter with the specified parameters and receives the corresponding JSON response for an
     * unpublished tweet.
     *
     * @param accountId - The identifier for the leveraged account. Appears within the resource’s path and is generally
     * a required parameter for all Advertising API requests excluding GET accounts. The specified account must be
     * associated with the authenticating user.
     * @param tweetIds - A comma-separated list of identifiers. Up to 200 IDs may be provided.
     * @param tweetType - The Tweet type for the specified tweet_ids.
     * @return -
     * @throws TwitterException - Exception class for when TwitterApi calls fail.
     */
    BaseAdsListResponse<TwitterCreativePreview> getPreviews(String accountId, List<String> tweetIds,
            TweetType tweetType)
            throws TwitterException;

}