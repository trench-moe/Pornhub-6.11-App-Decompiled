package com.app.pornhub.domain.model.video;

import com.appsflyer.oaid.BuildConfig;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\n\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/app/pornhub/domain/model/video/VideoContentType;", BuildConfig.FLAVOR, "code", BuildConfig.FLAVOR, "(Ljava/lang/String;IS)V", "getCode", "()S", "FREE", "FREE_PREMIUM", "PREMIUM", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public enum VideoContentType {
    FREE(0),
    FREE_PREMIUM(1),
    PREMIUM(2);
    
    private final short code;

    VideoContentType(short s10) {
        this.code = s10;
    }

    public final short getCode() {
        return this.code;
    }
}
