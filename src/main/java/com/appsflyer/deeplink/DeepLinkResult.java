package com.appsflyer.deeplink;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class DeepLinkResult {
    private final DeepLink deepLink;
    private final Error error;
    private final Status status;

    /* loaded from: classes.dex */
    public enum Error {
        TIMEOUT,
        NETWORK,
        HTTP_STATUS_CODE,
        UNEXPECTED,
        DEVELOPER_ERROR
    }

    /* loaded from: classes.dex */
    public enum Status {
        FOUND,
        NOT_FOUND,
        ERROR
    }

    public DeepLinkResult(DeepLink deepLink, Error error) {
        this.deepLink = deepLink;
        this.error = error;
        if (error != null) {
            this.status = Status.ERROR;
        } else if (deepLink != null) {
            this.status = Status.FOUND;
        } else {
            this.status = Status.NOT_FOUND;
        }
    }

    public DeepLink getDeepLink() {
        return this.deepLink;
    }

    public Error getError() {
        return this.error;
    }

    public Status getStatus() {
        return this.status;
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("deepLink", this.deepLink);
            jSONObject.put("error", this.error);
            jSONObject.put("status", this.status);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }
}
