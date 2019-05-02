package okhttp3;

import java.util.List;

public class NextcloudRequestBuilder {

    public static String relativeUrl(HttpUrl apiEndpoint, String relativeUrl) {
        HttpUrl resolvedUrl = apiEndpoint.resolve(relativeUrl);
        List<String> pathSegments = resolvedUrl.pathSegments();
        StringBuilder sb = new StringBuilder(resolvedUrl.encodedPath().length());
        HttpUrl.pathSegmentsToString(sb, pathSegments);
        return sb.toString();
    }
}
