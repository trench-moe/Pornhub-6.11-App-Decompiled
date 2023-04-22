package com.app.pornhub.domain.config;

import com.appsflyer.oaid.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/app/pornhub/domain/config/CommentsConfig;", BuildConfig.FLAVOR, "()V", "Companion", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CommentsConfig {
    public static final int COMMENTS_PAGE_LIMIT = 10;
    public static final Companion Companion = new Companion(null);
    public static final int USER_COMMENTS_PAGE_LIMIT = 16;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/app/pornhub/domain/config/CommentsConfig$Companion;", BuildConfig.FLAVOR, "()V", "COMMENTS_PAGE_LIMIT", BuildConfig.FLAVOR, "USER_COMMENTS_PAGE_LIMIT", "hasMoreComments", BuildConfig.FLAVOR, "size", "hasMoreWallComments", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean hasMoreComments(int i10) {
            return i10 % 10 == 0;
        }

        public final boolean hasMoreWallComments(int i10) {
            return i10 % 16 == 0;
        }
    }
}
