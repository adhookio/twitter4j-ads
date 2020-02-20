package twitter4jads.impl;

import static twitter4jads.TwitterAdsConstants.PARAM_CARD_URI;
import static twitter4jads.TwitterAdsConstants.PARAM_CURSOR;
import static twitter4jads.TwitterAdsConstants.PARAM_MEDIA_KEYS;
import static twitter4jads.TwitterAdsConstants.PARAM_NULLCAST;
import static twitter4jads.TwitterAdsConstants.PARAM_TEXT;
import static twitter4jads.TwitterAdsConstants.PARAM_USER_ID;
import static twitter4jads.TwitterAdsConstants.PATH_DRAFT_TWEETS;
import static twitter4jads.TwitterAdsConstants.PREFIX_ACCOUNTS_URI_5;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.reflect.TypeToken;

import twitter4jads.BaseAdsListResponse;
import twitter4jads.BaseAdsListResponseIterable;
import twitter4jads.BaseAdsResponse;
import twitter4jads.TwitterAdsClient;
import twitter4jads.TwitterAdsConstants;
import twitter4jads.api.TwitterDraftTweetApi;
import twitter4jads.internal.http.HttpParameter;
import twitter4jads.internal.models4j.TwitterException;
import twitter4jads.models.DraftTweet;
import twitter4jads.models.ads.HttpVerb;
import twitter4jads.util.TwitterAdUtil;

/**
 * User: anschuermann Date: 17/09/19 2:17 PM.
 */
public class TwitterDraftTweetsApiImpl implements TwitterDraftTweetApi {

    private final TwitterAdsClient twitterAdsClient;

    public TwitterDraftTweetsApiImpl(TwitterAdsClient twitterAdsClient) {
        this.twitterAdsClient = twitterAdsClient;
    }

    @Override
    public BaseAdsListResponseIterable<DraftTweet> fetch(String accountId, String userId, boolean withDeleted,
            Integer count, String cursor)
            throws TwitterException {

        TwitterAdUtil.ensureNotNull(accountId, "accountId");
        TwitterAdUtil.ensureNotNull(userId, "userId");

        final List<HttpParameter> params = new ArrayList<>();
        params.add(new HttpParameter(PARAM_USER_ID, userId));
        if (TwitterAdUtil.isNotNullOrEmpty(cursor)) {
            params.add(new HttpParameter(PARAM_CURSOR, cursor));
        }

        final String baseUrl = twitterAdsClient.getBaseAdsAPIUrl() + PREFIX_ACCOUNTS_URI_5 + accountId
                + PATH_DRAFT_TWEETS;
        final Type type = new TypeToken<BaseAdsListResponse<DraftTweet>>() {
        }.getType();
        return twitterAdsClient.executeHttpListRequest(baseUrl, params, type);
    }

    @Override
    public BaseAdsResponse<DraftTweet> fetchDraftTweetById(String accountId, String draftTweetId, boolean withDeleted)
            throws TwitterException {

        TwitterAdUtil.ensureNotNull(draftTweetId, "draftTweetId");
        TwitterAdUtil.ensureNotNull(accountId, "accountId");

        // noinspection MismatchedQueryAndUpdateOfCollection
        final List<HttpParameter> params = new ArrayList<>();

        final String baseUrl = twitterAdsClient.getBaseAdsAPIUrl() + PREFIX_ACCOUNTS_URI_5 + accountId
                + PATH_DRAFT_TWEETS + draftTweetId;
        final Type type = new TypeToken<BaseAdsResponse<DraftTweet>>() {
        }.getType();
        return twitterAdsClient.executeHttpRequest(baseUrl, params.toArray(new HttpParameter[params.size()]), type,
                HttpVerb.GET);
    }

    @Override
    public BaseAdsResponse<DraftTweet> create(String accountId, String text, String userId, String cardURI,
            List<String> mediaKeys,
            boolean nullCast) throws TwitterException {
        TwitterAdUtil.ensureNotNull(accountId, "accountId");
        TwitterAdUtil.ensureNotNull(userId, "userId");

        final List<HttpParameter> params = new ArrayList<>();
        params.add(new HttpParameter(TwitterAdsConstants.PARAM_AS_USER_ID, userId));
        if (TwitterAdUtil.isNotNullOrEmpty(cardURI)) {
            params.add(new HttpParameter(PARAM_CARD_URI, cardURI));
        }
        if (TwitterAdUtil.isNotEmpty(mediaKeys)) {
            params.add(new HttpParameter(PARAM_MEDIA_KEYS, TwitterAdUtil.getCsv(mediaKeys)));
        }
        if (TwitterAdUtil.isNotNullOrEmpty(text)) {
            params.add(new HttpParameter(PARAM_TEXT, text));
        }
        params.add(new HttpParameter(PARAM_NULLCAST, nullCast));

        final String baseUrl = twitterAdsClient.getBaseAdsAPIUrl() + PREFIX_ACCOUNTS_URI_5 + accountId
                + PATH_DRAFT_TWEETS;
        final Type type = new TypeToken<BaseAdsResponse<DraftTweet>>() {
        }.getType();
        return twitterAdsClient.executeHttpRequest(baseUrl, params.toArray(new HttpParameter[params.size()]), type,
                HttpVerb.POST);
    }

    @Override
    public BaseAdsResponse<DraftTweet> update(String accountId, String draftTweetId, String text, String cardURI,
            List<String> mediaKeys) throws TwitterException {
        TwitterAdUtil.ensureNotNull(accountId, "accountId");
        TwitterAdUtil.ensureNotNull(draftTweetId, "draftTweetId");

        final List<HttpParameter> params = new ArrayList<>();
        if (TwitterAdUtil.isNotNullOrEmpty(cardURI)) {
            params.add(new HttpParameter(PARAM_CARD_URI, cardURI));
        }
        if (TwitterAdUtil.isNotEmpty(mediaKeys)) {
            params.add(new HttpParameter(PARAM_MEDIA_KEYS, TwitterAdUtil.getCsv(mediaKeys)));
        }
        if (TwitterAdUtil.isNotNullOrEmpty(text)) {
            params.add(new HttpParameter(PARAM_TEXT, text));
        }

        final String baseUrl = twitterAdsClient.getBaseAdsAPIUrl() + PREFIX_ACCOUNTS_URI_5 + accountId
                + PATH_DRAFT_TWEETS + draftTweetId;
        final Type type = new TypeToken<BaseAdsResponse<DraftTweet>>() {
        }.getType();
        return twitterAdsClient.executeHttpRequest(baseUrl, params.toArray(new HttpParameter[params.size()]), type,
                HttpVerb.PUT);

    }

    @SuppressWarnings("Duplicates")
    @Override
    public BaseAdsResponse<DraftTweet> delete(String accountId, String draftTweetId) throws TwitterException {
        TwitterAdUtil.ensureNotNull(accountId, "Account Id");
        TwitterAdUtil.ensureNotNull(draftTweetId, "Tweet Id");
        String baseUrl = twitterAdsClient.getBaseAdsAPIUrl() + TwitterAdsConstants.PREFIX_ACCOUNTS_URI_5 + accountId
                + PATH_DRAFT_TWEETS + draftTweetId;
        Type type = new TypeToken<BaseAdsResponse<DraftTweet>>() {
        }.getType();
        return twitterAdsClient.executeHttpRequest(baseUrl, null, type, HttpVerb.DELETE);
    }
}
