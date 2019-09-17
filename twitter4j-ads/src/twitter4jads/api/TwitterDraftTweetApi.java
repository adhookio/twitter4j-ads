package twitter4jads.api;

import java.util.List;

import twitter4jads.BaseAdsListResponseIterable;
import twitter4jads.BaseAdsResponse;
import twitter4jads.internal.models4j.TwitterException;
import twitter4jads.models.DraftTweet;

/**
 * User: anschuermann Date: 17/09/19 8:26 PM.
 */
public interface TwitterDraftTweetApi {

    /**
     * @param accountId The identifier for the leveraged account.
     * @param userId Full promotable user Id.
     * @param withDeleted Include deleted results in your request. Defaults to false.
     * @param count Specifies the number of Draft Promoted Tweets to try to retrieve, up to a maximum of 1000 per
     * distinct request.
     * @param cursor Specifies a cursor to get the next page of Draft Promoted Tweets.
     */

    BaseAdsListResponseIterable<DraftTweet> fetch(String accountId, String userId, boolean withDeleted, Integer count,
            String cursor)
            throws TwitterException;

    /**
     * @param accountId The identifier for the leveraged account.
     * @param DraftTweetId The id of the Draft tweet
     * @param withDeleted Include deleted results in your request. Defaults to false.
     */
    BaseAdsResponse<DraftTweet> fetchDraftTweetById(String accountId, String DraftTweetId, boolean withDeleted)
            throws TwitterException;

    /**
     * @param accountId The identifier for the leveraged account.
     * @param userId The user ID of the advertiser on behalf of whom you are posting the Tweet. The advertiser must
     * grant your handle (or handles) access to their ads account via ads.twitter.com. This permission allows you to
     * call the API using the OAuth tokens of your own handle rather than the advertiser’s..
     * @param text The text of your status update, typically up to 140 characters.
     * @param cardURI Associate a card with the Tweet using the card_uri value from any cards response, if available.
     * card://855591459410511943 IMPORTANT
     * @param mediaKeys Associate media with the Tweet by specifying a comma-separated list of identifiers. Include up
     * to 4 images, 1 animated GIF, or 1 video. See Uploading Media for additional details on uploading media.
     * @param nullCast Whether to create a nullcasted (or “Promoted-only”) Tweet..
     */
    BaseAdsResponse<DraftTweet> create(String accountId, String text, String userId, String cardURI,
            List<String> mediaKeys,
            boolean nullCast) throws TwitterException;

    BaseAdsResponse<DraftTweet> update(String accountId, String DraftTweetId, String text, String cardURI,
            List<String> mediaKeys) throws TwitterException;

    BaseAdsResponse<DraftTweet> delete(String accountId, String DraftTweetId) throws TwitterException;
}
