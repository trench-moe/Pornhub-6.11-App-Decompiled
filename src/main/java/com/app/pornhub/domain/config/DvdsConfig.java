package com.app.pornhub.domain.config;

import com.appsflyer.oaid.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/app/pornhub/domain/config/DvdsConfig;", BuildConfig.FLAVOR, "()V", "Companion", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DvdsConfig {
    public static final Companion Companion = new Companion(null);
    public static final String DEFAULT_ORDER_PARAM = "p";
    public static final int DVD_PAGE_LIMIT = 16;
    public static final int DVD_VIDEOS_PAGE_LIMIT = 8;
    public static final String TYPE_CATEGORY = "c";
    public static final String TYPE_LETTER = "letter";
    public static final String TYPE_QUALITY = "hd";

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006J\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/app/pornhub/domain/config/DvdsConfig$Companion;", BuildConfig.FLAVOR, "()V", "DEFAULT_ORDER_PARAM", BuildConfig.FLAVOR, "DVD_PAGE_LIMIT", BuildConfig.FLAVOR, "DVD_VIDEOS_PAGE_LIMIT", "TYPE_CATEGORY", "TYPE_LETTER", "TYPE_QUALITY", "hasMoreDVdVideos", BuildConfig.FLAVOR, "size", "hasMoreDvds", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean hasMoreDVdVideos(int i10) {
            return i10 % 8 == 0;
        }

        public final boolean hasMoreDvds(int i10) {
            return i10 % 16 == 0;
        }
    }
}
