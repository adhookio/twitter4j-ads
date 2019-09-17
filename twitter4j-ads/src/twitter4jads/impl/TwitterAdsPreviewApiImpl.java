package twitter4jads.impl;

import static twitter4jads.TwitterAdsConstants.PARAM_ACCOUNT_ID;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

import com.google.common.collect.Lists;
import com.google.gson.reflect.TypeToken;

import twitter4jads.BaseAdsListResponse;
import twitter4jads.TwitterAdsClient;
import twitter4jads.TwitterAdsConstants;
import twitter4jads.api.TwitterAdsPreviewApi;
import twitter4jads.internal.http.HttpParameter;
import twitter4jads.internal.http.HttpResponse;
import twitter4jads.internal.models4j.TwitterException;
import twitter4jads.models.ads.TweetType;
import twitter4jads.models.ads.TwitterCreativePreview;
import twitter4jads.util.TwitterAdUtil;

/**
 * User: abhishek.chatrath
 * Date: 13/06/16
 */
public class TwitterAdsPreviewApiImpl implements TwitterAdsPreviewApi {

    private final TwitterAdsClient twitterAdsClient;

    public TwitterAdsPreviewApiImpl(TwitterAdsClient twitterAdsClient) {
        TwitterAdUtil.ensureNotNull(twitterAdsClient, "Twitter_Ads_Client");
        this.twitterAdsClient = twitterAdsClient;
    }

    @Override
    public BaseAdsListResponse<TwitterCreativePreview> getPreviews(String accountId, List<String> tweetIds,
            TweetType tweetType)
            throws TwitterException {

        List<HttpParameter> parameterList =
                validateAndGetParametersForUnpublishedPostPreview(accountId, tweetIds, tweetType);

        String baseUrl = twitterAdsClient.getBaseAdsAPIUrl() + TwitterAdsConstants.PREFIX_ACCOUNTS_URI_5 +
                accountId + TwitterAdsConstants.TWEET_PATH_PREVIEW;

        Type type = new TypeToken<BaseAdsListResponse<TwitterCreativePreview>>() {
        }.getType();
        HttpResponse response = twitterAdsClient.getRequest(baseUrl, parameterList.toArray(new HttpParameter[parameterList.size()]));

        try {
            return TwitterAdUtil.constructBaseAdsListResponse(response, response.asString(), type);
        } catch (IOException io) {
            throw new TwitterException("Response for tweet preview failed from TwitterApi.");
        }
    }

    private List<HttpParameter> validateAndGetParametersForUnpublishedPostPreview(String accountId,
            List<String> tweetIds, TweetType tweetType) {
        final String tweetIdsCsv = TwitterAdUtil.getCsv(tweetIds);

        final List<HttpParameter> parameterList = Lists.newArrayList();

        parameterList.add(new HttpParameter(PARAM_ACCOUNT_ID, accountId));

        if (TwitterAdUtil.isNotNullOrEmpty(tweetIdsCsv)) {
            parameterList.add(new HttpParameter(TwitterAdsConstants.PARAM_TWEET_IDS, tweetIdsCsv));
        }
        if (tweetType != null) {
            parameterList.add(new HttpParameter(TwitterAdsConstants.PARAM_TWEET_TYPE, tweetType.name()));
        }

        return parameterList;
    }
}